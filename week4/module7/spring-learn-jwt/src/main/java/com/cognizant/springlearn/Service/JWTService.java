package com.cognizant.springlearn.Service;

import java.util.Date;

import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Service 
public class JWTService {
	
	private final String SECRET_KEY = "cognizant123";
	
	public String generateToken(String username) {
		return Jwts.builder()
				.setSubject(username) 
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000*60*60))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY)
				.compact();
	}

}
