package com.tmt.switchcase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwitchController {
    
    @GetMapping(value="/")
    public String getPainting(Model model){

        model.addAttribute("painting", "starry-night");

        return "paintings";
    }
}
