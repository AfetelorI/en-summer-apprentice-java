package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Date;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
    // Găsește toate comenzile din tabel
    List<Orders> findAll();
    Orders findByOrderId(Long orderId);
    List<Orders> findByCustomerID(Long customerID);

    List<Orders> findByOrderedAtBetween(Date startDate, Date endDate);

    List<Orders> findByNumberOfTickets(int numberOfTickets);

    List<Orders> findByTotalPriceLessThan(double totalPrice);
}
