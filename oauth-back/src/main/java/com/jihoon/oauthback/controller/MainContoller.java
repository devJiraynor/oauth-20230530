package com.jihoon.oauthback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContoller {
  
  @GetMapping("")
  public String get() {
    return "Server On ...";
  }

}
