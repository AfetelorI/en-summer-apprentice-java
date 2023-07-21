package com.endava.ticket_manager_system.service.implementation;

import com.endava.ticket_manager_system.model.Orders;
import com.endava.ticket_manager_system.repository.OrdersRepository;
import com.endava.ticket_manager_system.service.DTO.OrdersDTO;
import com.endava.ticket_manager_system.service.Mapper.OrdersMapper;
import com.endava.ticket_manager_system.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrdersServiceImplementation implements OrderService {
    private OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImplementation(OrdersRepository ordersRepository){
        this.ordersRepository=ordersRepository;
    }

    @Override
    public OrdersDTO findByEventName(String eventName) {
        return null;
    }

    @Override
    public OrdersDTO findByOrderedAt(int NumberOfTickets){
        return OrdersMapper.converter((Orders) ordersRepository.findByNumberOfTickets(NumberOfTickets));
    }
    @Override
    public List<OrdersDTO> findAll(){
        return ordersRepository.findAll().stream().map(OrdersMapper::converter).collect(Collectors.toList());

    }

    @Override
    public OrdersDTO findByOrderId(int orderId) {
        return null;
    }

    @Override
    public List<OrdersDTO> findByCustomerId(Long customerId) {
        return null;
    }

    @Override
    public List<OrdersDTO> findByTicketCategoryId(Long ticketCategoryId) {
        return null;
    }

    @Override
    public List<OrdersDTO> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return null;
    }

    @Override
    public OrdersDTO createOrder(OrdersDTO ordersDTO) {
        return null;
    }

    @Override
    public OrdersDTO updateOrder(int orderId, OrdersDTO ordersDTO) {
        return null;
    }

    @Override
    public void deleteOrder(int orderId) {

    }
}
