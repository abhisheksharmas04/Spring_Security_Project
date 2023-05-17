package com.ab.udamey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.udamey.constants.ApplicationConstants;

@Controller
@RequestMapping(ApplicationConstants.BASE_URL)
public class NoticeController {

    @GetMapping(ApplicationConstants.NOTICE_ULR)
    public String getAllNotice(){
        return "This is NoticeController getAllNotice() method";
    }
    
}
