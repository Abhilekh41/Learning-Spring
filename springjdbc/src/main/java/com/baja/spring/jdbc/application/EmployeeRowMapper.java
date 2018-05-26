package com.baja.spring.jdbc.application;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt(1));
		employee.setDesignation(rs.getString(2));
		employee.setEmployeeName(rs.getString(3));
		employee.setPassword(rs.getString(4));
		employee.setTime(rs.getTimestamp(5));
		return employee;
	}
	
}
