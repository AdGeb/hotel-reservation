package com.gebura.hotelreservation.repository;

import com.gebura.hotelreservation.model.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
