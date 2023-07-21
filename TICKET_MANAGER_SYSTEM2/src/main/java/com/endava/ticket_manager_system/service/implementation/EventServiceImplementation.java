package com.endava.ticket_manager_system.service.implementation;

import com.endava.ticket_manager_system.model.Event;
import com.endava.ticket_manager_system.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import com.endava.ticket_manager_system.service.DTO.EventDTO;
import com.endava.ticket_manager_system.service.EventService;
import com.endava.ticket_manager_system.service.Mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;
@Service
public class EventServiceImplementation implements EventService{

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImplementation(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public EventDTO findByEventName(String eventName) {
        return EventMapper.converter(eventRepository.findByEventName(eventName));
    }

    @Override
    public List<EventDTO> findAll() {
        return eventRepository.findAll().stream().map(EventMapper::converter).collect(Collectors.toList());
    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public Event getEventById(int eventId) {
        return null;
    }

    @Override
    public List<Event> getEventsByVenueId(Long venueId) {
        return null;
    }

    @Override
    public List<Event> getEventsByEventTypeId(Long eventTypeId) {
        return null;
    }

    @Override
    public List<Event> getEventsByDateRange(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public Event updateEvent(int eventId, Event event) {
        return null;
    }

    @Override
    public void deleteEvent(int eventId) {

    }
}