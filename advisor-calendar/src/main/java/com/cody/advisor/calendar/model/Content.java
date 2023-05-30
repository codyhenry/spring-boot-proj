package com.cody.advisor.calendar.model;

import java.time.LocalDateTime;

public record Content(
                Integer id,
                String title,
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
 * String name,
 * String phone,
 * String email,
 * String marketer,
 * ArrayList<Event> events
 * Set<AdvisorStatus> status
 * LocalDateTime nextMeeting
 * Notes
 * ){}
 */