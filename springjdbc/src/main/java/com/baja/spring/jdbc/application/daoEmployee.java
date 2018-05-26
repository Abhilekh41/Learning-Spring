package com.baja.spring.jdbc.application;

import java.util.List;

public interface daoEmployee {
	int update(Employee employee);

	int create(Employee employee);

	int delete(Employee employee);

	Employee read(int i);
	
	List<Employee> completeData();
}
