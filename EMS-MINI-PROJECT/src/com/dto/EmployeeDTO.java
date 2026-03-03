package com.dto;

public class EmployeeDTO {

    private int eid;
    private int eage;
    private int epicode;

    //default constructor
    public EmployeeDTO() {
    }

    //parameterized constructor
    public EmployeeDTO(int eid, int eage, int epicode) {
        this.eid = eid;
        this.eage = eage;
        this.epicode = epicode;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public int getEpicode() {
        return epicode;
    }

    public void setEpicode(int epicode) {
        this.epicode = epicode;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "eid=" + eid +
                ", eage=" + eage +
                ", epicode=" + epicode +
                '}';
    }
}
