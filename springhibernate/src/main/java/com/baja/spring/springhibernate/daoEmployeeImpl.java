package com.baja.spring.springhibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class daoEmployeeImpl implements daoEmployee {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int create(Employee employee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setDesignation(employee.getDesignation());
		entity.setEmployeeId(employee.getEmployeeId());
		entity.setEmployeeName(employee.getEmployeeName());
		entity.setPassword(employee.getPassword());
		int i = (Integer) hibernateTemplate.save(entity);
		return i;
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setDesignation(employee.getDesignation());
		entity.setEmployeeId(employee.getEmployeeId());
		entity.setEmployeeName(employee.getEmployeeName());
		entity.setPassword(employee.getPassword());
		hibernateTemplate.update(entity);
	}

	//
	//
	@Override
	@Transactional
	public void delete(Employee employee) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setDesignation(employee.getDesignation());
		entity.setEmployeeId(employee.getEmployeeId());
		entity.setEmployeeName(employee.getEmployeeName());
		entity.setPassword(employee.getPassword());
		hibernateTemplate.delete(entity);
	}

	//
	//
	@Override
	public Employee read(int i) {
		EmployeeEntity employee = (EmployeeEntity) hibernateTemplate.get(EmployeeEntity.class, i);
		Employee entity = new Employee();
		entity.setDesignation(employee.getDesignation());
		entity.setEmployeeId(employee.getEmployeeId());
		entity.setEmployeeName(employee.getEmployeeName());
		entity.setPassword(employee.getPassword());
		entity.setTime(employee.getTime());
		return entity;

	}

	@Override
	public List<Employee> completeData() {
		List<EmployeeEntity> list = hibernateTemplate.loadAll(EmployeeEntity.class);
		List<Employee> empList = new ArrayList<Employee>();
		for (EmployeeEntity employeeEntity : list) {
			Employee employee = new Employee();
			employee.setDesignation(employeeEntity.getDesignation());
			employee.setEmployeeId(employeeEntity.getEmployeeId());
			employee.setEmployeeName(employeeEntity.getEmployeeName());
			employee.setPassword(employeeEntity.getPassword());
			employee.setTime(employeeEntity.getTime());
			
			empList.add(employee);
		}
		
		//System.out.println(empList.get(1).getDesignation());
		return empList;
	}

}
