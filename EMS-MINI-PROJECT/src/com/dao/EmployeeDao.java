package com.dao;

import com.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static List list;
    {
        list = new ArrayList();
    }

    public List insertEmployee(EmployeeDTO edto){

        List messageList = new ArrayList(); //MESSAGE LIST

        try {
            list.add(edto);
            messageList.add("Data Inserted Successfully");

        } catch (Exception e) {
            IO.println(e.getMessage());
            messageList.add("Exception Occurred While Inserting Employee");
            e.printStackTrace();
        }
        return messageList;
    }

    public List readAllEmployee(){
        return list;
    }

    public String removeSingleEmployee(int id){

        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            EmployeeDTO emp = (EmployeeDTO) list.get(i);
            if (emp.getEid() == id){
                list.remove(emp);
                counter++;
                break;
            }
        }
        if (counter == 1){
            return "Data Removed Successfully!";
        }else {
            return "Invalid Id!";
        }
    }

    public String updateSingleData(int eid, int eage) {

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            EmployeeDTO emp = (EmployeeDTO) list.get(i);
            if (emp.getEid() == eid){
                emp.setEage(eage);
                counter++;
                break;
            }
        }
        if (counter == 1){
            return "Data Updated Successfully!";
        }else {
            return "Invalid Id!";
        }
    }
}
