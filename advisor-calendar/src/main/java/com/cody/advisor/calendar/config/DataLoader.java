package com.cody.advisor.calendar.config;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.cody.advisor.calendar.model.Content;
import com.cody.advisor.calendar.repository.ContentRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

//Can use this to initialize data in a local database, runs after everything else is up
//determine when to run this code - set to not run in dev
@Profile("!production")
@Component
public class DataLoader implements CommandLineRunner {

  private final ContentRepository repository;
  private final ObjectMapper mapper;

  public DataLoader(ContentRepository repository, ObjectMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public void run(String... args) throws Exception {
    try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
      repository.saveAll(mapper.readValue(inputStream, new TypeReference<List<Content>>() {
      }));
    }
  }
}
