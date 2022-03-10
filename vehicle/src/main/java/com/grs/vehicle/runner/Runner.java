package com.grs.vehicle.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grs.vehicle.bean.VehicleBean;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		VehicleBean vehicle = context.getBean("bean", VehicleBean.class);

		vehicle.run();

	}

}
