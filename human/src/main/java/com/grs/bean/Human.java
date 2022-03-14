package com.grs.bean;

import lombok.Data;

@Data
public class Human {

	private String name;
	private double weight;

	private Heart heart;

	public Human() {
		System.out.println("default constructor");
	}

	public Human(String name, double weight, Heart heart) {
		this.name = name;
		this.weight = weight;
		this.heart = heart;

		System.out.println("The Weight of "+name+" is "+weight+" kgs");
	}

}
