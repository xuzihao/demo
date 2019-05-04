package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	//使用Autowired将StudentService注入到StudentController中
    @Autowired
    private DemoService service;

    @RequestMapping("/index")
    public String index(){
    	service.test();
        return "demo";
    }
    
}