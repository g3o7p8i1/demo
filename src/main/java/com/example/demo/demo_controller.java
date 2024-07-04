package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo_controller {
      @GetMapping("/msg")
      public String show(){
    	  return "hey buddy!!";
      }
}
