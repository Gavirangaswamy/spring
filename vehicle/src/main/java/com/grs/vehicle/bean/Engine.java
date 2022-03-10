package com.grs.vehicle.bean;

import lombok.Data;

@Data
public class Engine {

	String typeOfEngine;
	
	public void burnfuel() {
		System.out.println("Engine burns fuel to eun vehicle");
	}
}
