package com.javaspring.springbootfirstapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.springbootfirstapp.Constants;
import com.javaspring.springbootfirstapp.repository.staffrepository;
import com.javaspring.springbootfirstapp.staff;



@Service
public class StaffServices {

    
    @Autowired
    staffrepository staffrepository;
    public staff getstaffindex(int index) { //get staff index
        return staffrepository.getstaffindex(index);
    }
    public void addstaff(staff staff) {//add staff
        staffrepository.addstaff(staff);
    }
    public void setstaff(int index, staff staff) {//set staff
        staffrepository.setstaff(index, staff);
    }
    public List<staff> getAllStaff() { //get all staff
        return staffrepository.getAllStaff();
    }

    //get index of staff
    //if staffId is not found, return -1
    public int getstaffindex(String staffindex){
        for(int i = 0; i < getAllStaff().size(); i++){
            if(getstaffindex(i).getStaffId().equals(staffindex)){
                return i;
            }
        }
        return Constants.NO_MATCH;
    }
    public staff getStaffbyid(String id){
    int index = getstaffindex(id); //index of staff


    //if index is -1, then staff is empty    
    return index == Constants.NO_MATCH ? new staff() : getstaffindex(index);
    }


    public void stafferr (staff staff){ //
        //if result has errors, return addnewstaff

      
       
        int index = getstaffindex(staff.getStaffId()); //get index of staff
        if(index == Constants.NO_MATCH){     //if staff is empty then add staff to allStaff
            addstaff(staff);
        }else{ // if staff is not empty then update staff in allStaff
                setstaff(index, staff);
            }
    }
    
}
