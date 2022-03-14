package com.grs.bean;

import lombok.Data;

@Data
public class Tree {

	private String fruit;
	private Root root;

	public Tree() {

	}

	public void provideFruits() {
		root.stability();
		System.out.println("Fruit name : " + fruit);
	}

	public Tree(String fruit, Root root) {
		this.fruit = fruit;
		this.root = root;
	}

}
