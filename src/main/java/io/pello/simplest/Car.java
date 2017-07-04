package io.pello.simplest;


public class Car {
	private String plate;

	public Car () {
		this.plate = "EVL0666";
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + "]";
	}
	
	
}
