package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void displayCountry() {
		LOGGER.info("START");
		
		ApplicationContext contextCountry = new ClassPathXmlApplicationContext("country.xml");
		
		Country country = (Country) contextCountry.getBean("country");
		
		LOGGER.info("Country: {} " +country.toString() );
		
		LOGGER.info("END");
	}
	
	public static void displayCountries() {
		LOGGER.info("START: displayCountries()");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		
		List<Country> countryList = (List<Country>) context.getBean("countryList");
		
		for(Country c : countryList) {
			LOGGER.info(c.toString());
		}
		
		LOGGER.info("END");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
		
		displayCountry();
		displayCountries();
	}

}
