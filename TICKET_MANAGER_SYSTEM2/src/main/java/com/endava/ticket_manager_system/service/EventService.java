package com.endava.ticket_manager_system.service;

import com.endava.ticket_manager_system.model.Event;
import com.endava.ticket_manager_system.service.DTO.EventDTO;

import java.util.Date;
import java.util.List;

public interface EventService {
    EventDTO findByEventName(String eventName);

    List<EventDTO> findAll();

    List<Event> getAllEvents();

    Event getEventById(int eventId);

    List<Event> getEventsByVenueId(Long venueId);

    List<Event> getEventsByEventTypeId(Long eventTypeId);

    List<Event> getEventsByDateRange(Date startDate, Date endDate);

    Event createEvent(Event event);

    Event updateEvent(int eventId, Event event);

    void deleteEvent(int eventId);

    List<EventDTO> findByVenueNameAndEventType(int venueId, String eventType);
}
