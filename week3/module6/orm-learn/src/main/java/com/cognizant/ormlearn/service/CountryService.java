package com.cognizant.ormlearn.service;

import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.cognizant.ormlearn.repository.CountryRepository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
	

}
