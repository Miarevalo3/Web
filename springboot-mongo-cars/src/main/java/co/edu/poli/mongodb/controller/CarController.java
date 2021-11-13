package co.edu.poli.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.mongodb.model.Car;
import co.edu.poli.mongodb.repository.CarRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Api(tags = {"Class: CarController"}) //tag defined in SwaggerConfig.java
@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class CarController {

	@Autowired
	CarRepository carRepository;
	
	@GetMapping("/Cars")
	@ApiOperation(value = "*** Service Method Get All Cars ***", notes = "*** Get All Cars from MongoDB\\\\WebApp ***")
	@ApiResponses(value = {@ApiResponse(code = 404, message = "*** Error Get All Cars!!! ***")})
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
	
	@GetMapping("/Cars/{id}")
	public Car getCarByID(@PathVariable String id) {
		return carRepository.findById(id).get();
	}
	
	@PostMapping("/Cars")
	public Car saveCar(@RequestBody Car car){
		return carRepository.save(car);
	}
	
	@PostMapping("/CarsList")
	public List<Car> saveListCars(@RequestBody List<Car> cars) {		
		return carRepository.saveAll(cars);
	}
	
	@PutMapping("/Cars/{id}")
	public Car updateCar(@PathVariable String id, @RequestBody Car car) {
		
		Car _car = carRepository.findById(id).get();
		
		_car.setName(car.getName());
	    
		_car.setMiles_per_Gallon(car.getMiles_per_Gallon());
	    
		_car.setCylinders(car.getCylinders());
	    
		_car.setDisplacement(car.getDisplacement());
	    
		_car.setHorsepower(car.getHorsepower());
	    
		_car.setWeight_in_lbs(car.getWeight_in_lbs());
	    
		_car.setAcceleration(car.getAcceleration());
	    
		_car.setYear(car.getYear());
	    
		_car.setOrigin(car.getOrigin());
		
		carRepository.save(_car);
		
		return _car;
	}
	
	@DeleteMapping("/Cars/{id}")
	public Car deleteCarById(@PathVariable String id) {
		Car _car = carRepository.findById(id).get();
		carRepository.deleteById(id);
		return _car;
	}
	
	@DeleteMapping("/CarsList")
	public void deleteAll() {
		carRepository.deleteAll();
	}
	
}
