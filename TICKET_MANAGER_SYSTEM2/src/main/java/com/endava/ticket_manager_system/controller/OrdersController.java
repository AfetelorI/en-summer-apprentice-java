package com.endava.ticket_manager_system.controller;
import com.endava.ticket_manager_system.service.OrderService;
import com.endava.ticket_manager_system.service.DTO.OrdersDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/orders") // Base path for the controller
public class OrdersController {
    private final OrderService ordersService;

    public OrdersController(OrderService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<OrdersDTO> getAllOrders() {
        return ordersService.findAll();
    }

    @GetMapping("/{orderId}")
    public OrdersDTO getOrderById(@PathVariable int orderId) {
        return ordersService.findByOrderId(orderId);
    }

    @GetMapping("/customer/{customerId}")
    public List<OrdersDTO> getOrdersByCustomerId(@PathVariable Long customerId) {
        return ordersService.findByCustomerId(customerId);
    }

    @GetMapping("/ticket-category/{ticketCategoryId}")
    public List<OrdersDTO> getOrdersByTicketCategoryId(@PathVariable Long ticketCategoryId) {
        return ordersService.findByTicketCategoryId(ticketCategoryId);
    }

    @GetMapping("/date")
    public List<OrdersDTO> getOrdersByDateRange(@RequestParam LocalDateTime startDate, @RequestParam LocalDateTime endDate) {
        return ordersService.findByDateRange(startDate, endDate);
    }

    @PostMapping
    public OrdersDTO createOrder(@RequestBody OrdersDTO ordersDTO) {
        return ordersService.createOrder(ordersDTO);
    }

    @PutMapping("/{orderId}")
    public OrdersDTO updateOrder(@PathVariable int orderId, @RequestBody OrdersDTO ordersDTO) {
        return ordersService.updateOrder(orderId, ordersDTO);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable int orderId) {
        ordersService.deleteOrder(orderId);
    }
}