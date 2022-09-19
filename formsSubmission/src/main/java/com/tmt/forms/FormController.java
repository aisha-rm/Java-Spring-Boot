package com.tmt.forms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    //array to store data from form
    List<Grade> studentGrades = new ArrayList<>(); 
    
    @GetMapping("/")    //form on home page
    //empty grade object is used to populate form before it is updated with data
    public String gradeForm(Model model){
        model.addAttribute("grades", new Grade());
        return "form";
    }

    @PostMapping("/handleSubmit")
    //handler for POST request uses grade object to receive the PAYLOAD, SB used the empty constuctor and setters to update the object fields
    //grade object is added to ArrayList to update iy
    public String submitForm(Grade grade){
        studentGrades.add(grade);
        return "redirect:/grades";  //client is redirected to view the data stored, on a new GET request handled below
    }

    @GetMapping("/grades")
    public String getGrades(Model model){
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
