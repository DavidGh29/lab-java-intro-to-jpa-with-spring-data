package com.example.labweek7final.service;

import com.example.labweek7final.model.Flight;
import com.example.labweek7final.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }

    public List<Flight> getAll() {
        return repository.findAll();
    }

    public Flight save(Flight flight) {
        return repository.save(flight);
    }

}
