package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.TicketCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Long> {
    List<TicketCategory> findAll();

    TicketCategory findByTicketCategoryId(Long ticketCategoryId);

    List<TicketCategory> findByEventId(Long eventId);
    List<TicketCategory> findByDescriptionn(String descriptionn);


}
