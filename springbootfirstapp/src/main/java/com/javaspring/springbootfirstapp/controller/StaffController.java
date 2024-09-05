package com.javaspring.springbootfirstapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaspring.springbootfirstapp.Services.StaffServices;
import com.javaspring.springbootfirstapp.staff;

import jakarta.validation.Valid;

@Controller
public class StaffController {
    
    @Autowired
    StaffServices staffServices;
    ///StaffServices StaffServices = new StaffServices();//staff services object to access staff services  methods old way !
    
    @GetMapping("/")
    public String addNewStaff(Model model,@RequestParam(required=false) String staffId){
        //if index is -1, then staff is empty
        //if index is not -1, then staff is not empty
        model.addAttribute("staff", staffServices.getStaffbyid(staffId));
        return "addnewstaff";
    
    }


    @PostMapping("/dataSubmitForm")
    // @Valid is used to validate the form data binding result is used to store the result of validation !!!
    public String dataSubmitForm(@Valid @ModelAttribute ("staff") staff staff, BindingResult result  ){ 
        
        
        //if result has errors, return addnewstaff
        if(result.hasErrors()){
            return "addnewstaff";
        }
        
        staffServices.stafferr(staff);
        return "redirect:/getAllstaff"; 
    
    }

    @GetMapping("/getAllstaff")
    public String getAllStaff(Model model) {
        model.addAttribute("staff", staffServices.getAllStaff());
        return "getAllstaff";
    }
}




