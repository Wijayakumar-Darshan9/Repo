package com.example.Car_Rental_Spring.Repository;

import com.example.Car_Rental_Spring.Entity.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {


    List<Appointment> findBySent(boolean sent);

}
