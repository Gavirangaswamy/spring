package com.grs.vehicle.bean;

import lombok.Data;

@Data
public class VehicleBean {

	String typeOfVehicle;
	Engine engine;

	public VehicleBean(String typeOfVehicle, Engine engine) {
		this.typeOfVehicle = typeOfVehicle;
		this.engine = engine;
	}

	public void run() {
		System.out.println(typeOfVehicle + " run by " + engine.typeOfEngine);
	}

}
