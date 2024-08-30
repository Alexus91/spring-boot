package com.javaspring.springbootfirstapp;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class staffcontroler {

    List<staff> staff = new ArrayList<>();

    @GetMapping("/staff")
    public String getstaffName(Model model) {
        staff.add ( new staff("John", "S001", "Manager", 30, 5000));
        
        staff.add ( new staff("mike", "S002", "Devloper", 22, 3000));
       
        staff.add ( new staff("kamal", "S003", "Designer", 33, 2000));
        
        model.addAttribute("staff", staff);
        
        return "staff.html";
    }

    
}
