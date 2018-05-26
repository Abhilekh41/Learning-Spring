package com.baja.spring.advanced.stereotype.annotation.value.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
	@Value("2")
	private int id;
	@Value("Abhilekh")
	private String name;
	@Value("#{lists}")
	private List<String> topics;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + "]";
	}

}
