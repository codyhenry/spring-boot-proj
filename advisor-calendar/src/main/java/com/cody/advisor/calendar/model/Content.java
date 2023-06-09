package com.cody.advisor.calendar.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;

public record Content(
    @Id Integer id,
    @NotBlank String title,
    String description,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUploaded,
    String url) {
}

/*
 * public record Advisor(
 * Integer id,
 * 
 * @NotBlank String name,
 * 
 * @Pattern String phone,
 * 
 * @Email @NotBlank String email,
 * String marketer,
 * ArrayList<Event> events
 * Set<AdvisorStatus> status
 * 
 * @FutureOrPresent LocalDateTime nextMeeting
 * ){}
 */