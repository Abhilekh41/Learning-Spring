package com.baja.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int addEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setDesignation(employee.getDesignation());
		employeeEntity.setEmployeeName(employee.getEmployeeName());
		employeeEntity.setPassword(employee.getPassword());
		
		Integer result = (Integer) hibernateTemplate.save(employeeEntity);
		return result;
	}
	
}
