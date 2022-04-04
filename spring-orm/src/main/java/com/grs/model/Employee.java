package com.grs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name="employee_name")
	private String name;
	@Column(name="employee_city")
	private String city;
	@Column(name="employee_salary")
	private int salary;
}
