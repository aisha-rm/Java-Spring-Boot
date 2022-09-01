package com.tmt.utilitymethod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityMethodController {
    
    @GetMapping(value="/")
    public String getView(Model model){
        model.addAttribute("name", "Aisha");

        return "view";
    }
}
