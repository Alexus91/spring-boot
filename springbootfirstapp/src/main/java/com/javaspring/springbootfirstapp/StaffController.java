package com.javaspring.springbootfirstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StaffController {

    List<staff> allStaff = new ArrayList<>();

    @GetMapping("/")
    public String addNewStaff(Model model) {
        model.addAttribute("staff", new staff());
        return "addnewstaff";
    }

    @PostMapping("/dataSubmitForm")
    public String dataSubmitForm(staff staff) {
        allStaff.add(staff);
        return "redirect:/getAllstaff";
    }

    @GetMapping("/getAllstaff")
    public String getStaff(Model model) {
        model.addAttribute("staff", allStaff);
        return "getAllstaff";
    }
}




