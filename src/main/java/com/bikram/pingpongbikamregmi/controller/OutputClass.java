package com.bikram.pingpongbikamregmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class OutputClass {

    @GetMapping("/pong")
    public String showMessage() {

        return "pong";
    }
}
