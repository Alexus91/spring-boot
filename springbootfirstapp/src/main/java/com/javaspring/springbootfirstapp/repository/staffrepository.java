package com.javaspring.springbootfirstapp.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaspring.springbootfirstapp.staff;


@Repository
public class staffrepository {

    private final  List<staff> allStaff = new ArrayList<>();//list of staff

    public staff getstaffindex(int index) {//get staff index
        return allStaff.get(index);
    }
    public void addstaff(staff staff) {//add staff
        allStaff.add(staff);
    }
    public void setstaff(int index, staff staff) {//    set staff
        allStaff.set(index, staff);
    }
    public List<staff> getAllStaff() { //get all staff
        return allStaff;
    }



    
}
