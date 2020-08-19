package com.gebura.hotelreservation.model.entity;

import lombok.Data;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "roomId")
    private Room room;

    private String username;
    private Integer peopleToAccommodate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
