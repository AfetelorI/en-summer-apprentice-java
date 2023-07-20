package com.endava.ticket_manager_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Customers", schema = "dbo")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerID;

    @Column(name = "CustomerName")
    private String CustomerName;

    @Column(name = "Email")
    private String Email;

// Getters and Setters

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

// Constructors

    public Customers() {
    }

    public Customers(int customerID, String customerName, String email) {
        customerID = customerID;
        CustomerName = customerName;
        Email = email;
    }


}