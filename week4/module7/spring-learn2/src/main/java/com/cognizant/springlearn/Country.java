package com.cognizant.springlearn;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {
	private String code;
	private String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	public Country() {
		LOGGER.info("Inside Country Constructor");
	}
	
	public String toString() {
		return this.code + " " + this.name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

