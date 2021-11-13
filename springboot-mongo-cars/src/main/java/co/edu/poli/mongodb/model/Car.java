package co.edu.poli.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cars")
public class Car {
	
	@Id
	private String id;
	
    private String name;
    
    private int miles_per_Gallon;
    
    private int cylinders;
    
    private int displacement;
    
    private int horsepower;
    
    private int weight_in_lbs;
    
    private int acceleration;
    
    private String year;
    
    private String origin;
    
    public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String id, String name, int miles_per_Gallon, int cylinders, int displacement, int horsepower,
			int weight_in_lbs, int acceleration, String year, String origin) {
		this.id = id;
		this.name = name;
		this.miles_per_Gallon = miles_per_Gallon;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.horsepower = horsepower;
		this.weight_in_lbs = weight_in_lbs;
		this.acceleration = acceleration;
		this.year = year;
		this.origin = origin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMiles_per_Gallon() {
		return miles_per_Gallon;
	}

	public void setMiles_per_Gallon(int miles_per_Gallon) {
		this.miles_per_Gallon = miles_per_Gallon;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getWeight_in_lbs() {
		return weight_in_lbs;
	}

	public void setWeight_in_lbs(int weight_in_lbs) {
		this.weight_in_lbs = weight_in_lbs;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
}