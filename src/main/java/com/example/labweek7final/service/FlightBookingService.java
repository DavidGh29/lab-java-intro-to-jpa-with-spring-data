package com.example.labweek7final.service;
import com.example.labweek7final.repository.FlightBookingRepository;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingService {

    private final FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }
}
