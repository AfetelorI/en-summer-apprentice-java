package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.TicketCategory;
import com.endava.ticket_manager_system.model.Venue;
import org.springframework.data.repository.CrudRepository;

import javax.xml.stream.Location;
import java.util.List;

public interface VenueRepository extends CrudRepository<Venue, Long> {
    List<Venue> findAll();
    Venue findByVenueID(Long VenueID);
    List<Venue> findByLocation(String Location);
    List<Venue> findByType(String Type);
    List<Venue> findByCapacity(int Capacity);

}

