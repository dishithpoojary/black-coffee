package com.black.coffee.geo.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
    @GetMapping("/ping")
    @ResponseBody
    public String first() {
        return "Chalo coffee peene";
    }
}
