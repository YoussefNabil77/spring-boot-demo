package com.codewithyoussef.demo.controller;

import com.codewithyoussef.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private  StudentService studentService;


    @GetMapping("/hello")
    public String PrintHello() {
        return studentService.getHelloMessage();
    }

}
