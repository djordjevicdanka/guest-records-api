package com.example.guestrecordsapi.repository;

import com.example.guestrecordsapi.dto.Response;
import com.example.guestrecordsapi.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Statement;
import java.util.List;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    @Query("select new com.example.guestrecordsapi.dto.Response(h.name, g.name) from Hotel h join Guest g on h.hotelId=g.guestId ")

     public List<Response> findAllHotels();




}
