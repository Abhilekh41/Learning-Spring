package com.baja.spring.springhibernate;

import java.util.List;

public interface daoEmployee {
	void update(Employee employee);

	int create(Employee employee);

	void delete(Employee employee);

	Employee read(int i);
	
	List<Employee> completeData();
}
