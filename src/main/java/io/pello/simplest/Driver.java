package io.pello.simplest;
import javax.inject.Inject;
import javax.inject.Named;


public class Driver {
	private String name;
	private int age;
	private Car car;
	
	public Driver () {
		this.name = "Eugene";
		this.age = 42;
	}
	
	public Driver(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	@Inject
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

	
	
}
