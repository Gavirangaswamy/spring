package com.grs.lemon.bean;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import lombok.Data;

@Data
public class LemonBean {
	
	String mantravadiName;
	String location;
	int[] nums;
	ArrayList<String> manthravaadis;
	Map<String,String> magicians;
	Properties mantravettas;
	
	public void maataManthra() {
		System.out.println(mantravadiName+" is famous for maatamantra");
		System.out.println("available mantravaadi's ");
		System.out.println(manthravaadis);
		System.out.println("available mantravaadi's with address");
		System.out.println(magicians);
		System.out.println(mantravettas);
		
	}

}
