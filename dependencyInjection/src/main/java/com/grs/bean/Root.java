package com.grs.bean;

import lombok.Data;

@Data
public class Root {

	String typeOfSoil;

	public void stability() {
		System.out.println("it provides stability to tree");
	}

	public void absorbNutrients() {
		System.out.println("it absorb nutrients to stability to tree");
	}

}
