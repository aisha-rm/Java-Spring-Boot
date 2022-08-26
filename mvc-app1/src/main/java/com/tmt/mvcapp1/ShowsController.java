package com.tmt.mvcapp1;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller  //turns class to controller
public class ShowsController {

     /*
    @GetMapping("/grades")  //turns the method to a handler, deals with get requests on this path
    public String getGrades(){
        return "grades";  //return html template with this name
    }
    */
    
    @GetMapping("/shows")
    public String getShows(Model model){
        
        //handler method  has access to model using this parameter
        // create POJO object for each show
        Show show1 = new Show("Breaking Bad", "Ozymandias", 10.0);
        Show show2 = new Show("Attack on Titan", "Hero", 9.9);
        Show show3 = new Show("Attack on Titan", "Perfect Game", 9.9);
        Show show4 = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
        Show show5 = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);

        //now to store the data in the model
        model.addAttribute("show1", show1);
        model.addAttribute("show2", show2);
        model.addAttribute("show3", show3);
        model.addAttribute("show4", show4);
        model.addAttribute("show5", show5);

        return "shows";  //the shows.html file will be retuned as the view using data from model 
    

        /*
        //Using HashMap to achieve same (was used in the past) - will need to remove model param in handler
        Map<String, Show> model = new HashMap<String, Show>();
        model.put("show1", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.put("show2", new Show("Attack on Titan", "Perfect Game", 9.9));
        model.put("show3", new Show("Attack on Titan", "Perfect Game", 9.9));
        model.put("show4", new Show("Star Wars: The Clone Wars", "Victory and Death", 	9.9));
        model.put("show5", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));

        return new ModelAndView("shows", model); //return type should reflect in handler definition
        */
    }
}
