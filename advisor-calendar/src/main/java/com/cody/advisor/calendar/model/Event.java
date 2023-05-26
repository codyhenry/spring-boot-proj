package com.cody.advisor.calendar.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event {
  Integer id;
  LocalDateTime eventDate;
  String location;
  Type eventType;
  EventStatus eventStatus = EventStatus.UPCOMING;

  public Event() {
  }

  public Event(Integer id, LocalDateTime eventDate, String location, Type eventType, EventStatus eventStatus) {
    this.id = id;
    this.eventDate = eventDate;
    this.location = location;
    this.eventType = eventType;
    this.eventStatus = eventStatus;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getEventDate() {
    return this.eventDate;
  }

  public void setEventDate(LocalDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Type getEventType() {
    return this.eventType;
  }

  public void setEventType(Type eventType) {
    this.eventType = eventType;
  }

  public EventStatus getEventStatus() {
    return this.eventStatus;
  }

  public void setEventStatus(EventStatus eventStatus) {
    this.eventStatus = eventStatus;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", eventDate='" + getEventDate() + "'" +
        ", location='" + getLocation() + "'" +
        ", eventType='" + getEventType() + "'" +
        ", eventStatus='" + getEventStatus() + "'" +
        "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Event)) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(id, event.id) && Objects.equals(eventDate, event.eventDate)
        && Objects.equals(location, event.location) && Objects.equals(eventType, event.eventType)
        && Objects.equals(eventStatus, event.eventStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventDate, location, eventType, eventStatus);
  }

}
