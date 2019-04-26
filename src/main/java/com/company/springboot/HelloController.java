package com.company.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

//    @GetMapping("/main")
//    public String main(Map<String, Object> model) {
//        String message = "some text";
//
//        model.put("message", message);
//
//        return "main";
//    }


}