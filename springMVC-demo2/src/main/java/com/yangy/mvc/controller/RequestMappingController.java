package com.yangy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class RequestMappingController {
//    @RequestMapping("/")
//    public String index(){
//        return "target";
//    }

    @RequestMapping("/testRequestMapping")
    public String success(){
        return "success";
    }

}
