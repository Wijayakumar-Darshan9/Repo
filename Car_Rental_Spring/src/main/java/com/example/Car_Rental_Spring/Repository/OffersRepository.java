package com.example.Car_Rental_Spring.Repository;

import com.example.Car_Rental_Spring.Entity.Offers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffersRepository extends MongoRepository<Offers, String> {
}
