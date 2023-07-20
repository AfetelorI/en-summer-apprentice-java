package com.endava.ticket_manager_system.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TicketCategory", schema = "dbo")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketCategoryID;

    @ManyToOne
    @JoinColumn(name = "EventID")
    private Eventt Eventt;

    @OneToMany(mappedBy = "TicketCategory",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Orders> orderList;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Price")
    private BigDecimal Price;

    public TicketCategory(int ticketCategoryID, Eventt eventID, String description, BigDecimal price) {
        TicketCategoryID = ticketCategoryID;
        Eventt = eventID;
        Description = description;
        Price = price;
    }
    public TicketCategory(){

    }

    public int getTicketCategoryID() {
        return TicketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        TicketCategoryID = ticketCategoryID;
    }

    public Eventt getEventID() {
        return Eventt;
    }

    public void setEventID(Eventt eventID) {
        Eventt = eventID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }
}