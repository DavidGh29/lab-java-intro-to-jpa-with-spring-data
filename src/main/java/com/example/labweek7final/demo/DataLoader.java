package com.example.labweek7final.demo;

import com.example.labweek7final.model.Customer;
import com.example.labweek7final.model.CustumerStatus;
import com.example.labweek7final.model.Flight;
import com.example.labweek7final.model.FlightBooking;
import com.example.labweek7final.repository.CustomerRepository;
import com.example.labweek7final.repository.FlightBookingRepository;
import com.example.labweek7final.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataLoader {
     public static void main(String[] args) {
         SpringApplication.run(DataLoader.class, args);
     }

     @Bean
     CommandLineRunner run(CustomerRepository customerRepository,
                           FlightRepository flightRepository,
                           FlightBookingRepository bookingRepository) {
         return args -> {
             Customer alice = customerRepository.save(new Customer("Alice", CustumerStatus.GOLD,120000));
             Customer bob = customerRepository.save(new Customer("Bob", CustumerStatus.SILVER,80000));
             Customer charlie = customerRepository.save(new Customer("Charlie", CustumerStatus.NONE,20000));

             Flight f1 =flightRepository.save(new Flight("AB123","Boeing 747",300,400));
             Flight f2 =flightRepository.save(new Flight("CD456","Boeing 777",100,300));
             Flight f3 =flightRepository.save(new Flight("EF789","Airbus A320",350,500));

             bookingRepository.save(new FlightBooking(alice.getId(), f1.getId()));
             bookingRepository.save(new FlightBooking(bob.getId(), f2.getId()));
             bookingRepository.save(new FlightBooking(charlie.getId(), f3.getId()));
         };
     }
}
