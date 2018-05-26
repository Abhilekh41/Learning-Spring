package com.baja.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext(
				"com/baja/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) cpx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?,?)";
		int result = jdbcTemplate.update(sql,2,"worker","Devraj","Madharchod");
		System.out.println(result);

	}
}
