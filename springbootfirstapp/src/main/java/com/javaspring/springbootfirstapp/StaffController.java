package com.javaspring.springbootfirstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StaffController {

    List<staff> allStaff = new ArrayList<>();

    @GetMapping("/")
    public String addNewStaff(Model model,@RequestParam(required=false) String staffId){
        staff staff = new staff(); //empty
        int index = getstaffindex(staffId); //index of staff
        
        //if index is -1, then staff is empty
        //if index is not -1, then staff is not empty
        model.addAttribute("staff",index == Constants.NO_MATCH ?staff: allStaff.get(index));
        return "addnewstaff";
    
    }
    //get index of staff
    //if staffId is not found, return -1
    public int getstaffindex(String staffId){
        for(int i = 0; i < allStaff.size(); i++){
            if(allStaff.get(i).getStaffId().equals(staffId)){
                return i;
            }
        }
        return Constants.NO_MATCH;
    }

    @PostMapping("/dataSubmitForm")
    public String dataSubmitForm(staff staff) {
        
        int index = getstaffindex(staff.getStaffId()); //get index of staff
        
        if(index == Constants.NO_MATCH){     //if staff is empty then add staff to allStaff
            allStaff.add(staff);
        }else{ // if staff is not empty then update staff in allStaff
            allStaff.set(index, staff);
        }
        return "redirect:/getAllstaff"; 
    }

    @GetMapping("/getAllstaff")
    public String getStaff(Model model) {
        model.addAttribute("staff", allStaff); //add allStaff to model 
        return "getAllstaff";
    }
}




