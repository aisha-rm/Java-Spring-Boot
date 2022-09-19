package com.tmt.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
    
    @GetMapping("/")
    public String gradeForm(Model model){
        model.addAttribute("grades", new Grade("Aisha", "Java", 99));
        return "form";
    }
}
