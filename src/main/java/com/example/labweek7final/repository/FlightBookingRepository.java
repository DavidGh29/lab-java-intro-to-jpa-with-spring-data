package com.example.labweek7final.repository;

import com.example.labweek7final.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
    List<FlightBooking> findByCustomerId(Integer CustomerId);
    List<FlightBooking> findByFlightId(Integer FlightId);
}
