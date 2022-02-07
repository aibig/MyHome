package com.example.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 아무것도 작성안하면 기본경로
    @GetMapping
    public String index() {
        return "index";
    }
}
