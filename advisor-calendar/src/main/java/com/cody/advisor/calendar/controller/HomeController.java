package com.cody.advisor.calendar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  // get values from application.properties
  @Value("${cc.welcomeMessage:Default Welcome Message}")
  private String welcomeMessage;

  @Value("${cc.about}")
  private String about;

  // @GetMapping("/")
  // public String home() {
  // return welcomeMessage;
  // }

  // @GetMapping("/")
  // public Map<String, String> home() {
  // return Map.of("welcomeMessage", welcomeMessage, "about", about);
  // }

  @GetMapping("/")
  public String home() {
    return welcomeMessage;
  }
}
