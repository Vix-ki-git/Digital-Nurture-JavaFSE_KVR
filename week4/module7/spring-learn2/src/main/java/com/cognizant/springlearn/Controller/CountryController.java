package com.cognizant.springlearn.Controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.Service.CountryService;

import java.util.List;

@RestController
public class CountryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		
		Country country = (Country) context.getBean("country");
		
		LOGGER.info("END");
		
		return country;
	}
	
	@GetMapping("/countries") 
	public List<Country> getCountries() {
		LOGGER.info("START: /countries");
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("country.xml");
		
		List<Country> countryList = (List<Country>) context2.getBean("countryList");
		
		LOGGER.info("END");
		
		return countryList;
	}
	
	@GetMapping("/country/{code}")
	public Country getCountry(@PathVariable String code) {
		LOGGER.info("START: /countries/"+code);
		
		CountryService countryService = new CountryService();
		
		Country c = countryService.getCountry(code);
		
		LOGGER.info("END");
		
		return c;
	}

}
