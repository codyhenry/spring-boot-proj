package com.cody.advisor.calendar.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.cody.advisor.calendar.model.Content;

//Needs type and id
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

}
