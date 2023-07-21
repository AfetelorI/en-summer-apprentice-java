package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Date;

public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findAll();

    Event findByEventId(Long eventId);

    List<Event> findByVenueId(Long venueId);

    List<Event> findByEventTypeId(Long eventTypeId);

    void deleteByEventId(Long eventId);

    List<Event> findByStartDateBetween(Date startDate, Date endDate);

    Event findByEventName(String eventName);
}