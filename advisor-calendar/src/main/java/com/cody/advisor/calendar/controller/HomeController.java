package com.cody.advisor.calendar.controller;

// import java.util.Map;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cody.advisor.calendar.config.ContentCalendarProperties;

@RestController
public class HomeController {

  private final ContentCalendarProperties properties;

  public HomeController(ContentCalendarProperties properties) {
    this.properties = properties;
  }
  // get values from application.properties
  // @Value("${cc.welcomeMessage:Default Welcome Message}")
  // private String welcomeMessage;

  // @Value("${cc.about}")
  // private String about;

  // @GetMapping("/")
  // public String home() {
  // return welcomeMessage;
  // }

  // @GetMapping("/")
  // public Map<String, String> home() {
  // return Map.of("welcomeMessage", welcomeMessage, "about", about);
  // }

  @GetMapping("/")
  public ContentCalendarProperties home() {
    return properties;
  }
}
