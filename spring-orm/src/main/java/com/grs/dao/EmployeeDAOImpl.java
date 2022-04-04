package com.grs.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.grs.model.Employee;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

//	@Autowired
//	private SessionFactory sessionFactory;

	@Autowired
	private HibernateTemplate template;

	@Transactional
	@Override
	public void saveEmployee(Employee employee) {
//		Session session = this.sessionFactory.openSession();
//		session.getTransaction().begin();
//		session.save(employee);
//		session.getTransaction().commit();
//		session.close();
		template.save(employee);

		System.out.println("employee saved");
	}

	@Override
	public List<Employee> getEmployee() {
//		Session session = this.sessionFactory.openSession();
//		List<Employee> employeeList = session.createQuery("from Employee").list();
//		session.close();
		return null;
	}

}
