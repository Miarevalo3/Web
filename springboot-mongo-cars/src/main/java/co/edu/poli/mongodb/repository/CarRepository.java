package co.edu.poli.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.poli.mongodb.model.Car;

public interface CarRepository extends MongoRepository<Car, String>{

	
}
