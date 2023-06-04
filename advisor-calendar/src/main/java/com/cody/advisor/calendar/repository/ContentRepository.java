package com.cody.advisor.calendar.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.cody.advisor.calendar.model.Content;

//Needs type and id
//extending a class with CRUD methods built in so do not need to add any here
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

}
