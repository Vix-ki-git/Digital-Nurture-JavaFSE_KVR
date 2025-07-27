package com.cognizant.springlearn.Service;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;

@Service
public class CountryService {
	
	
	public static Country getCountry(String code) {
		ApplicationContext countryContext = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = (List<Country>) countryContext.getBean("countryList");
		
		for(Country c: countryList) {
			if(c.getCode().equalsIgnoreCase(code)) 
				return c;
		}
		
		return null;
		
		
	}

}
