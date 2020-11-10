package com.example.guestrecordsapi.repository;

import com.example.guestrecordsapi.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {



}
