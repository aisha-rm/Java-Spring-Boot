package com.springb.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutPage {
    
    @RequestMapping("/about")
    public String getAbout() {
        return "This page is about to the author";
    }
    
}
