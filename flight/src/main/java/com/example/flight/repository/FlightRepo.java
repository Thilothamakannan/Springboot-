package com.example.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flight.model.FlightBooking;

@Repository
public interface FlightRepo extends JpaRepository<FlightBooking, Integer> {

}