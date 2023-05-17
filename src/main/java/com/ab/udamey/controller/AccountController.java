package com.ab.udamey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.udamey.constants.ApplicationConstants;

@RestController
@RequestMapping(ApplicationConstants.BASE_URL)
public class AccountController {
    
    @GetMapping(ApplicationConstants.ACCOUNT_URL)
    public String getAccountDetails(){
        return "This is AccountController getAccountDetails() method";
    }
    
}
