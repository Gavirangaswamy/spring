package com.grs.springdemo.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grs.springdemo.bean.SeasonBean;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SeasonBean bean =context.getBean("bean", SeasonBean.class);
		System.out.println(bean);
		
		SeasonBean bean1 =context.getBean("bean", SeasonBean.class);
		System.out.println(bean1);
	}

}
