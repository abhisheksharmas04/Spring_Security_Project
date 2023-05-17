package com.ab.udamey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.udamey.constants.ApplicationConstants;

@Controller
@RequestMapping(ApplicationConstants.BASE_URL)
public class CardController {

    @GetMapping(ApplicationConstants.CARD_URL)
    public String getCardDetails() {
        return "This is CardController getCardDetails() method";
    }
}
