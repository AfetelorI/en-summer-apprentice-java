package com.endava.ticket_manager_system.service.Mapper;

import com.endava.ticket_manager_system.model.Orders;
import com.endava.ticket_manager_system.service.DTO.OrdersDTO;

public class OrdersMapper {

    public static OrdersDTO converter(Orders orders) {
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setOrdersDTOID(orders.getOrderID());
        ordersDTO.setOrderedAt(orders.getOrderedAt());
        ordersDTO.setNumberOfTickets(orders.getNumberOfTickets());
        ordersDTO.settotalPrice(orders.getTotalPrice());
        ordersDTO.setcustomerID(orders.getCustomerID());
        ordersDTO.setTicketCategoryID(orders.getTicketCategoryID());

        return ordersDTO;
    }
}