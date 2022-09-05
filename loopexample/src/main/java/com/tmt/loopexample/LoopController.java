package com.tmt.loopexample;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoopController {
    //create a list of objects that will be stored in the model
    //and be used in a loop to create a table of employees in the html template
    //create it here and not inside the handler method as to prevent duplicating the data when the handler is called multiple times eg when a page is refreshed
    List<Employee> employees = Arrays.asList(
        new Employee("Jim Halpert", 32, "Salesman"),
        new Employee("Andy Bernard", 38, "Salesman"),
        new Employee("Pam Beesly", 32, "Receptidonist"),
        new Employee("Michael Scott", 49, "Regional Manager"),
        new Employee("Ryan Howard", 28, "Temp"),
        new Employee("Angela Martin", 35, "Accountant"),
        new Employee("Dwight Schrute", 37, "Assistant to the Regional Manager")
    );
    
    @GetMapping(value="/")
    public String getEmployees(Model model){
        model.addAttribute("employeeList", employees);
        return "staff";
    }
}
