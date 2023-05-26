package com.cody.advisor.calendar.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.cody.advisor.calendar.model.Content;
import com.cody.advisor.calendar.model.Status;
import com.cody.advisor.calendar.model.Type;

import jakarta.annotation.PostConstruct;

@Repository
public class ContentCollectionRepository {

  private final List<Content> contentList = new ArrayList<Content>();

  public ContentCollectionRepository() {
  }

  public List<Content> findAll() {
    return contentList;
  }

  public Optional<Content> findById(Integer id) {
    return contentList.stream().filter(item -> item.id().equals(id)).findFirst();
  }

  public void create(Content content) {
    contentList.add(content);
  }

  public void update(Content content) {
    contentList.removeIf(c -> c.id().equals(content.id()));
    contentList.add(content);
  }

  public boolean idExists(Integer id) {
    return contentList.stream().filter(item -> item.id().equals(id)).count() == 1;
  }

  public void delete(Integer id) {
    contentList.removeIf(c -> c.id().equals(id));
  }

  @PostConstruct
  private void init() {
    Content content = new Content(
        1,
        "First Blog Post",
        "The first blog post",
        Status.IDEA,
        Type.ARTICLE,
        LocalDateTime.now(),
        null,
        "");
    contentList.add(content);
  }
}
