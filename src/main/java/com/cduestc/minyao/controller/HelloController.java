package com.cduestc.minyao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/main")
    public String Hello1()
    {
        return "/main";
    }
    @RequestMapping("/gezhe")
    public String Hello2()
    {
        return "/gezhe";
    }
    @RequestMapping("/story")
    public String Hello3()
    {
        return "/story";
    }
}
