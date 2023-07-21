package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.EventType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventTypeRepository extends CrudRepository<EventType, Long> {
    List<EventType> findAll();

    EventType findByEventTypeId(Long eventTypeId);
    EventType findByEventTypeName(String eventTypeName);

}
