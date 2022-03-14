package com.grs.bean;

import lombok.Data;

@Data
public class Heart {

	private byte noOfChambers;
	private int noOfCountPerMinute;

	public Heart() {
		System.out.println("Heart's main function is to move blood throughout your body");
	}

	public Heart(byte noOfChambers, int noOfCountPerminute) {
		this.noOfChambers = noOfChambers;
		this.noOfCountPerMinute = noOfCountPerminute;

		System.out.println("Heart consist of " + noOfChambers + " chambers and beats per minute " + noOfCountPerMinute);
	}
}
