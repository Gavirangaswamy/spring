package com.grs.bean;

import lombok.Data;

@Data
public class Person {

	private String name;
	private Address vilasa;
	
	public Person(){
		
	}

	
	public void getAddress() {
		
		System.out.println("Name : "+name+"\n"+vilasa);
	}

	

}
