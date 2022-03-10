package com.grs.lemon.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grs.lemon.bean.LemonBean;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("context.xml");
		LemonBean lemon = context.getBean("bean", LemonBean.class);
		lemon.maataManthra();
		System.out.println(lemon.getLocation());
		System.out.println(Arrays.toString(lemon.getNums()));
		
	}

}
