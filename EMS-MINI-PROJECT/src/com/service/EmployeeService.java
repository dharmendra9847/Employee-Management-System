package com.service;

import com.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService  {

    List addEmployee(EmployeeDTO edto);
    List readAllEmployee();
    String removeSingleEmployee(int id);
    String updateSingleData(int eid, int eage);
}
