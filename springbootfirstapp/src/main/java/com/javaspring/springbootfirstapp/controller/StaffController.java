package com.javaspring.springbootfirstapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaspring.springbootfirstapp.Constants;
import com.javaspring.springbootfirstapp.repository.staffrepository;
import com.javaspring.springbootfirstapp.staff;

import jakarta.validation.Valid;

@Controller
public class StaffController {


    staffrepository staffrepository = new staffrepository();
    @GetMapping("/")
    public String addNewStaff(Model model,@RequestParam(required=false) String staffId){
        staff staff = new staff(); //empty
        int index = getstaffindex(staffId); //index of staff
        
        //if index is -1, then staff is empty
        //if index is not -1, then staff is not empty
        model.addAttribute("staff",index == Constants.NO_MATCH ?staff: staffrepository.getstaffindex(index));
        return "addnewstaff";
    
    }
    //get index of staff
    //if staffId is not found, return -1
    public int getstaffindex(String staffId){
        for(int i = 0; i < staffrepository.getAllStaff().size(); i++){
            if(staffrepository.getstaffindex(i).getStaffId().equals(staffId)){
                return i;
            }
        }
        return Constants.NO_MATCH;
    }

    @PostMapping("/dataSubmitForm")
    // @Valid is used to validate the form data binding result is used to store the result of validation !!!
    public String dataSubmitForm(@Valid @ModelAttribute ("staff") staff staff, BindingResult result  ){ 
        
        
        //if result has errors, return addnewstaff
        if(result.hasErrors()){
            return "addnewstaff";
        }
        
        int index = getstaffindex(staff.getStaffId()); //get index of staff
        
        if(index == Constants.NO_MATCH){     //if staff is empty then add staff to allStaff
            staffrepository.addstaff(staff);
        }else{ // if staff is not empty then update staff in allStaff
            staffrepository.setstaff(index, staff);       }
        return "redirect:/getAllstaff"; 
    
    }

    @GetMapping("/getAllstaff")
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staffrepository.getAllStaff());
        return "getAllstaff";
    }
}




