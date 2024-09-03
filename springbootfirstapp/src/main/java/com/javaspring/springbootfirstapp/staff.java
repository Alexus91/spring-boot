package com.javaspring.springbootfirstapp;
import java.util.UUID;//importing UUID class for having a raindom id for staff
public class staff {
    private String staffName;
    private String staffId;
    private String staffPosition;
    private int staffAge;
    private double staffSalary;

    

   

    // Getters and setters
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public staff() {
        this.staffId = UUID.randomUUID().toString();
       
    }
    

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public double getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }
}