package com.baja.spring.jdbc.application;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class daoEmployeeImpl implements daoEmployee{
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?,?,curdate())";
		int result = jdbcTemplate.update(sql,employee.getEmployeeId(),employee.getDesignation(),employee.getEmployeeName(),employee.getPassword());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set designation=?,employeeName=?,password=? where employeeId=?";
		int result = jdbcTemplate.update(sql,employee.getDesignation(),employee.getEmployeeName(),employee.getPassword(),employee.getEmployeeId());
		return result;
	}


	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where employeeId=?";
		int result = jdbcTemplate.update(sql,employee.getEmployeeId());
		return result;
			}


	@Override
	public Employee read(int i) {
		String sql = "select * from employee where employeeid=?";
		EmployeeRowMapper erm = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql,erm,i);
		return employee;
		
	}


	@Override
	public List<Employee> completeData() {
		String sql = "select * from employee";
		EmployeeRowMapper erm = new EmployeeRowMapper();
		List<Employee> employeeList = jdbcTemplate.query(sql,erm);
		return employeeList;
	}


	
}
