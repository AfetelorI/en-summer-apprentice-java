package com.endava.ticket_manager_system.service;

import com.endava.ticket_manager_system.service.DTO.OrdersDTO;
import com.endava.ticket_manager_system.service.DTO.OrdersDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    OrdersDTO findByEventName(String eventName);

    OrdersDTO findByOrderedAt(int NumberOfTickets);

    List<OrdersDTO> findAll();

    OrdersDTO findByOrderId(int orderId);

    List<OrdersDTO> findByCustomerId(Long customerId);

    List<OrdersDTO> findByTicketCategoryId(Long ticketCategoryId);

    List<OrdersDTO> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    OrdersDTO createOrder(OrdersDTO ordersDTO);

    OrdersDTO updateOrder(int orderId, OrdersDTO ordersDTO);

    void deleteOrder(int orderId);
}
