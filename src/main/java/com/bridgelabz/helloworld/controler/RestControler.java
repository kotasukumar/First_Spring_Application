package com.bridgelabz.helloworld.controler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler {

    @RequestMapping(path = "/hello")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping(path = "/hello/message")
    public String message(Model model){
        model.addAttribute("message", "This is message");
        return "message";
    }

}
