package com.example.guestrecordsapi.repository;

import com.example.guestrecordsapi.model.Guest;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
