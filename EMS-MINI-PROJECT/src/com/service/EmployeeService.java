package com.service;

import com.dto.EmployeeDTO;

public class EmployeeService {

    public int addEmployee(EmployeeDTO edto){

        //DATA PROCESSING
        int res = validateEmployee(edto);
        if(res == 100){
            //DAO LAYER : LATER
            //return 0; //JUST TO GET RID OF ERROR
            return res;
        }else {
            return res;
        }

    }

    public int validateEmployee(EmployeeDTO edto){

        if (edto.getEid()<1 ||  edto.getEid()>100){
            return 4041;
        }else if (edto.getEage()<1 || edto.getEage()>40){
            return 4042;
        }else if (edto.getEpicode()<100000 || edto.getEpicode()>999999){
            return 4043;
        }else {
            return 100;
        }
    }
//    public void test(){}
}
