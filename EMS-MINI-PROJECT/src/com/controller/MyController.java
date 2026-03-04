package com.controller;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

import java.util.List;

public class MyController {

    private EmployeeService employeeService;

    public MyController(){
        employeeService = new EmployeeServiceImpl();
    }

    public List addEmployee(EmployeeDTO edto){

        List list = employeeService.addEmployee(edto);
        return list;
    }

    public List readAllEmployee(){
        return employeeService.readAllEmployee();
    }

    public String removeSingleEmployee(int id){
        return employeeService.removeSingleEmployee(id);
    }

    public String updateSingleData(int eid, int eage) {
        return employeeService.updateSingleData(eid, eage);
    }
}
