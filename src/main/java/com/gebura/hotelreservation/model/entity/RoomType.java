package com.gebura.hotelreservation.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class RoomType {
    @Id
    private String roomType;
    private Integer capacity;
}
