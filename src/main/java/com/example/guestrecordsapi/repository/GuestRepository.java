package com.example.guestrecordsapi.repository;

import com.example.guestrecordsapi.dto.Response;
import com.example.guestrecordsapi.model.Guest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {


}

