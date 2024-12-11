package com.example.Car_Rental_Spring.Repository;


import com.example.Car_Rental_Spring.Entity.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}
