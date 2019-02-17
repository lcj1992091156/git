package com.lcj.com.lcj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContrlloer {
    @ResponseBody
    @RequestMapping(value = "/hello2")
    public String hello2() {
        return "222";
    }
}
