package com.grs.bean;

import lombok.Data;

@Data
public class Address {

	private String city;
	private String area;
	private int houseNo;
	private int pincode;

	public Address() {

	}
}
