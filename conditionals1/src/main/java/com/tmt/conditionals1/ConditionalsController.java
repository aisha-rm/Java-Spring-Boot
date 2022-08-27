package com.tmt.conditionals1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConditionalsController {
    
    @GetMapping("/")
    public String getSpeeed(Model model){

        model.addAttribute("speed", 95);

        return "conditionals1";
    }
}
