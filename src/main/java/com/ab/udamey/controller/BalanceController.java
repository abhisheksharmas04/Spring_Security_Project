package com.ab.udamey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.udamey.constants.ApplicationConstants;

@Controller
@RequestMapping(ApplicationConstants.BASE_URL)
public class BalanceController {

    @GetMapping(ApplicationConstants.BALANCE_URL)
    public String getBalance() {
        return "This is balance controller getBalance() method";
    }
}
