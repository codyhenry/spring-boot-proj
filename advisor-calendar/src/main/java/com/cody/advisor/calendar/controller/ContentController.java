package com.cody.advisor.calendar.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cody.advisor.calendar.model.Content;
import com.cody.advisor.calendar.repository.ContentCollectionRepository;
import com.cody.advisor.calendar.repository.ContentRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/content")
// ! Add security here
@CrossOrigin
public class ContentController {
  // replaced ContentCollectionRepository
  private final ContentRepository repository;

  public ContentController(ContentRepository repository) {
    this.repository = repository;
  }

  // make a request and find all the pieces of content in the system
  @GetMapping("")
  public List<Content> getAllContent() {
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Content getOne(@PathVariable Integer id) {
    return repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  public void addNew(@Valid @RequestBody Content content) {
    // changed from create
    repository.save(content);
  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @PutMapping("/{id}")
  public void change(@RequestBody Content content, @PathVariable Integer id) {
    // changed from findById
    if (!repository.existsById(id)) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
    }
    // changed from update
    repository.save(content);
  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("/{id}")
  public void remove(@PathVariable Integer id) {
    // changed from delete
    repository.deleteById(id);
  }

  // custom endpoint
  @GetMapping("/filter/{keyword}")
  public List<Content> findByTitle(@PathVariable String keyword) {
    return repository.findAllByTitleContains(keyword);
  }

}
