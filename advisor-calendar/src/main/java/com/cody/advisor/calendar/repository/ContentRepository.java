package com.cody.advisor.calendar.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import com.cody.advisor.calendar.model.Content;
import com.cody.advisor.calendar.model.Status;

//Needs type and id
//extending a class with CRUD methods built in so do not need to add any here
public interface ContentRepository extends ListCrudRepository<Content, Integer> {
  // ListCrudRepository has keywords to chain what youre looking for
  List<Content> findAllByTitleContains(String keyword);

  @Query("""
      SELECT * FROM Content
      WHERE status = :status
      """)
  List<Content> listByStatus(@Param("status") Status status);
}
