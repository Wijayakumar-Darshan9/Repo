package com.example.Car_Rental_Spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "Appointments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    private String id; // Use String for MongoDB IDs

    private String userName;
    private String userEmail;
    private String phoneNumber;
    private LocalDate date;
    private String reason;

    private boolean sent; // Add the sent field

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public boolean isSent() {
        return sent;
    }
}
