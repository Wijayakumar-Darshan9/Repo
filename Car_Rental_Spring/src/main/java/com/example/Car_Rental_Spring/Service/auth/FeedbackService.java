package com.example.Car_Rental_Spring.Service.auth;

import com.example.Car_Rental_Spring.Entity.Feedback;
import com.example.Car_Rental_Spring.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    // Save a feedback document
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    // Retrieve all feedback documents
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}
