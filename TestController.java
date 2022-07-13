package com.example.accessingdatarest.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController{
  
  @RequestMapping("/hello")
  public String hello() {
    return "Hello World";
  }
}
