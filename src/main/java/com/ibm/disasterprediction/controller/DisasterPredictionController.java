package com.ibm.disasterprediction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisasterPredictionController {
  
  
  @GetMapping("/")
  public String getValue
    (){
    
       return "Inside DisasterPredictionController";
  }
}