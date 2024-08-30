package com.javaspring.springbootfirstapp;

public class staff {
    private String staffName;
    private String staffId;
    private String staffPosition;
    private int staffAge;
    private int staffSalary;

    public staff(String staffName, String staffId, String staffPosition, int staffAge, int staffSalary) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.staffPosition = staffPosition;
        this.staffAge = staffAge;
        this.staffSalary = staffSalary;
    }

    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffId() {
        return this.staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffPosition() {
        return this.staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public int getStaffAge() {
        return this.staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public int getStaffSalary() {
        return this.staffSalary;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }
}

    