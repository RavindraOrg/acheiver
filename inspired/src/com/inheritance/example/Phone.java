package com.inheritance.example;

public class Phone {
	private String model;

	@Override
	public String toString() {
		return "Phone{" +
				"model='" + model + '\'' +
				'}';
	}

	public Phone(String model) {
		this.model = model;
	}
    
	public void features(){
		System.out.println("Feature phone");
	}

	public String getModel() {
		return model;
	}
	
}
