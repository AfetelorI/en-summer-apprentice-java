package com.endava.ticket_manager_system.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Eventt", schema = "dbo")
public class Eventt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EventID;

    public Eventt(int eventID, Venue venueID, Eventt eventTypeID, String eventDescription, String eventName, LocalDateTime startDate, LocalDateTime endDate) {
        EventID = eventID;
        VenueID = venueID;
        EventTypeID = eventTypeID;
        EventDescription = eventDescription;
        EventName = eventName;
        StartDate = startDate;
        EndDate = endDate;
    }

    public int getEventID() {
        return EventID;
    }

    public void setEventID(int eventID) {
        EventID = eventID;
    }

    public Venue getVenueID() {
        return VenueID;
    }

    public void setVenueID(Venue venueID) {
        VenueID = venueID;
    }

    public Eventt getEvenTypeID() {
        return EventTypeID;
    }

    public void setEvenTypeID(Eventt eventTypeID) {
        EventTypeID = eventTypeID;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        StartDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        EndDate = endDate;
    }

    @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue VenueID;

    @ManyToOne
    @JoinColumn(name = "EvenTypeID")
    private Eventt EventTypeID;

    @Column(name = "EventDescription")
    private String EventDescription;

    @Column(name = "EventName")
    private String EventName;

    @Column(name = "StartDate")
    private LocalDateTime StartDate;

    @Column(name = "EndDate")
    private LocalDateTime EndDate;

    public Eventt(){

    }
}