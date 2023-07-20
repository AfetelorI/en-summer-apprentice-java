package com.endava.ticket_manager_system.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders", schema = "dbo")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customers customerID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategoryID;

    @Column(name = "OrderedAt")
    private LocalDateTime OrderedAt;

    @Column(name = "NumberOfTickets")
    private int NumberOfTickets;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    public Orders(int orderID, Customers customerID, TicketCategory TicketCategoryID, LocalDateTime OrderedAt, int numberOfTickets, BigDecimal totalPrice) {
        OrderID = orderID;
        this.customerID = customerID;
        this.ticketCategoryID = TicketCategoryID;
        this.OrderedAt = OrderedAt;
        NumberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Orders(){

    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public Customers getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customers customerID) {
        this.customerID = customerID;
    }

    public TicketCategory getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(TicketCategory ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public LocalDateTime getOrderedAt() {
        return OrderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        OrderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        NumberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}