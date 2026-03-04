package com.service;

import com.dao.EmployeeDao;
import com.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeDao edao;

   public EmployeeServiceImpl(){
       edao = new EmployeeDao();
   }

   @Override
    public List addEmployee(EmployeeDTO edto){

        //DATA PROCESSING
        List list = validateEmployee(edto);

        if(list.isEmpty()){
            //DAO LAYER : LATER
            list = edao.insertEmployee(edto);
            return list;
        }else {
            return list;
        }
    }

    public List validateEmployee(EmployeeDTO edto){

        List list = new ArrayList(); //ERROR LIST

        if (edto.getEid()<1 ||  edto.getEid()>100){
            list.add("\nInvalid Employee ID");
        }if (edto.getEage()<1 || edto.getEage()>40){
            list.add("Invalid Employee Age");
        }if (edto.getEpicode()<100000 || edto.getEpicode()>999999){
            list.add("Invalid Employee Epicode\n");
        }
        return list;
    }

    @Override
    public List readAllEmployee() {
        return edao.readAllEmployee();
    }

    @Override
    public String removeSingleEmployee(int id) {
        return edao.removeSingleEmployee(id);
    }

    @Override
    public String updateSingleData(int eid, int eage) {

       //VALIDATE ID & AGE
        return edao.updateSingleData(eid, eage);
    }
}
