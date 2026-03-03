package com.controller;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;

public class MyController {

    private EmployeeService employeeService; //null by default

    public MyController(){
        employeeService = new EmployeeService();
    }

    public int addEmployee(EmployeeDTO edto){

        //SERVICE CALL
//        EmployeeService eservice = new EmployeeService();
//        eservice.addEmployee(edto);
        int res = employeeService.addEmployee(edto);
        return res;

    }

//    public void test(){
//
//        //SERVICE CALL
//    }
}
