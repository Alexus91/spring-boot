package com.javaspring.springbootfirstapp.repository;
import java.util.ArrayList;
import java.util.List;

import com.javaspring.springbootfirstapp.staff;

public class staffrepository {

    private List<staff> allStaff = new ArrayList<>();

    public staff getstaffindex(int index) {
        return allStaff.get(index);
    }
    public void addstaff(staff staff) {
        allStaff.add(staff);
    }
    public void setstaff(int index, staff staff) {
        allStaff.set(index, staff);
    }
    public List<staff> getAllStaff() {
        return allStaff;
    }



    
}
