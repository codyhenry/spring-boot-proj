package com.cody.advisor.calendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Can use this to initialize data in a local database, runs after everything else is up
//determine when to run this code - set to not run in dev
@Profile("!dev")
@Component
public class DataLoader implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello");
  }
}
