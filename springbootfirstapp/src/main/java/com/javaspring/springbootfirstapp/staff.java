package com.javaspring.springbootfirstapp;
import java.util.UUID;

public class staff {
    private String staffName;
    private String staffId;
    private String staffPosition;
    private int staffAge;
    private double staffSalary;

    public staff() {
    }

    public staff(String staffName, String staffId, String staffPosition, int staffAge, double staffSalary) {
        this.staffName = staffName;
        this.staffId = UUID.randomUUID().toString();
        this.staffPosition = staffPosition;
        this.staffAge = staffAge;
        this.staffSalary = staffSalary;
    }

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