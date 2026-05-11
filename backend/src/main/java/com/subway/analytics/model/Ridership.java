package com.subway.analytics.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ridership")
public class Ridership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timestamp;

    private String station;

    private String borough;

    private Integer ridership;

    private Integer transfers;

    private Integer hour;

    public Ridership() {
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getStation() {
        return station;
    }

    public String getBorough() {
        return borough;
    }

    public Integer getRidership() {
        return ridership;
    }

    public Integer getTransfers() {
        return transfers;
    }

    public Integer getHour() {
        return hour;
    }
}