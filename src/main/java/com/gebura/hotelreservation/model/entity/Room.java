package com.gebura.hotelreservation.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roomType")
    private RoomType roomType;
}

