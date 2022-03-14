package com.grs.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grs.bean.Tree;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Tree tree = context.getBean(Tree.class);
		tree.provideFruits();

	
	}

}
