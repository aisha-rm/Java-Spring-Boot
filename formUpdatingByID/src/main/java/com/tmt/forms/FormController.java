package com.tmt.forms;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    //arrayList to store data from form
    List<Grade> studentGrades = new ArrayList<>(); 
    
    //form prsented on path "/"
    //empty grade object is used to populate form before it is updated with data
    //the parameter in specified in a GET request is passed as a param into the handler method as follows
    //the parameter is annotated to specify it comes only from a GET request, required = false makes it optional
    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required=false) String id){
        int index = getGradeIndex(id);  //find index of the given param in datastore
        Grade grade;  //value passed to model below based on if else
        if (index == Constants.NOT_FOUND){
            grade = new Grade();
        }else{
            grade = studentGrades.get(index);
        }

        model.addAttribute("grades", grade);
        //below is alternative to if -else
        //model.addAttribute("grades", index==-100? new Grade() : studentGrades.get(index));
        
        return "form";
    }

    
    //handler for POST request, uses grade object in the parameter to receive the PAYLOAD, 
    //SB uses the empty constuctor and setters to update the object fields
    //grade object needs to be added to ArrayList to update it
    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Grade grade, BindingResult result, Model model){

        
        if (result.hasErrors()) {
            
            return "form";//keep user in from if error in validation, not redirect so as not to lose th BR info
        }

        int index=getGradeIndex(grade.getId());
        if (index == Constants.NOT_FOUND){
            //if it doesnt, add it to the datastore
            studentGrades.add(grade);
        }else{
            //if it exists, update its index with this new grade info
            studentGrades.set(index, grade);
        }        
        return "redirect:/grades";  //client is redirected to view the data stored, on a new GET request handled below
    }

    @GetMapping("/grades")
    public String getGrades(Model model){
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    //create function to get the index of the grade object whose id was passed in the GET request
    //that is in order to find appropriately query the datastore
    public int getGradeIndex(String id){
        for (int i=0; i<studentGrades.size(); i++){
            if (studentGrades.get(i).getId().equals(id)) return i;
             }
        return Constants.NOT_FOUND; //returned if the index is not found
    }
}
