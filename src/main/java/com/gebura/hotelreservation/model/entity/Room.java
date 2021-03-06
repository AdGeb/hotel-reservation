package com.gebura.hotelreservation.model.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "roomType")
    private RoomType roomType;
}

