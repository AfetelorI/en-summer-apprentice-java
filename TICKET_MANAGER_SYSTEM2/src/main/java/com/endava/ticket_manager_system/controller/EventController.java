package com.endava.ticket_manager_system.controller;

import com.endava.ticket_manager_system.service.EventService;
import org.springframework.web.bind.annotation.*;
import com.endava.ticket_manager_system.service.DTO.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {
    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/find/{eventName}", method = RequestMethod.GET)
    public EventDTO findByEventName(@PathVariable String eventName) {
        return eventService.findByEventName(eventName);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<EventDTO> findAll() {
        return eventService.findAll();
    }

    @GetMapping("/events")
    public ResponseEntity<List<EventDTO>> getEventsByVenueIdAndEventTypeName(
            @RequestParam("venueId") int venueId,
            @RequestParam("eventType") String eventType) {

        List<EventDTO> events = eventService.findByVenueNameAndEventType(venueId, eventType);

        if (events.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(events);
        }
    }
}