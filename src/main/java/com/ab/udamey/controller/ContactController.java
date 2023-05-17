package com.ab.udamey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.udamey.constants.ApplicationConstants;

@Controller
@RequestMapping(ApplicationConstants.BALANCE_URL)
public class ContactController {

    @GetMapping(ApplicationConstants.CONTACT_URL)
    public String getContanct(){
        return "This is ContanctController getContact() method";
    }
    
}
