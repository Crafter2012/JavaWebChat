package com.webchat.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConferenceController
{
    @RequestMapping(value = "/home")
    public String configCheck()
    {
        return "configCheck";
    }
}
