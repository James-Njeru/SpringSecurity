package com.example.SecurityDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//https://medium.com/code-with-farhan/spring-security-2023-4110f1e33b47

@Controller
@RequestMapping("")
public class HomeController {
	
	@ResponseBody
    @GetMapping("/")
    public String index(){
        return "hello world";
    }
	
	@ResponseBody
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
