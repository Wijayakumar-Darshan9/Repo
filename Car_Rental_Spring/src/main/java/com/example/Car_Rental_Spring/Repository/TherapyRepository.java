package com.example.Car_Rental_Spring.Repository;

import com.example.Car_Rental_Spring.Entity.Therapy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapyRepository extends MongoRepository<Therapy, String> {
    // Add custom queries if needed, e.g., find by patient name
    Therapy findByPatientName(String patientName);
}
