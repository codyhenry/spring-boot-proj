package com.cody.advisor.calendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Can use this to initialize data in a local database, runs after everything else is up
//@Component
public class DataLoader implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello");
  }
}
