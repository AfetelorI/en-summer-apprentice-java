package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.Eventt;
import com.sun.java.accessibility.util.EventID;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Date;

public interface EventRepository extends CrudRepository<Eventt, Long> {
    // Găsește toate evenimentele din tabel
    List<Eventt> findAll();

    Eventt findByEventId(Long eventId);

    List<Eventt> findByVenueId(Long venueId);

    List<Eventt> findByEventTypeId(Long eventTypeId);

    void deleteByEventId(Long eventId);

    List<Eventt> findByStartDateBetween(Date startDate, Date endDate);
}