package com.example.Car_Rental_Spring.Repository;

import com.example.Car_Rental_Spring.Entity.LabReport;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LabReportRepository extends MongoRepository<LabReport, String> {
    List<LabReport> findByPatientId(String patientId);
}
