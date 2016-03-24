package com.example.project.controllers;

import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Artur on 23.03.16.
 */
@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    String home(){
        System.out.println("no i aber asd");
        userService.create("dupa dupa");
        return "/index";
    }

}
