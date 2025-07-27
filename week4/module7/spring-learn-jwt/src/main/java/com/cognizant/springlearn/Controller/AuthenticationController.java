package com.cognizant.springlearn.Controller;

import com.cognizant.springlearn.Service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JWTService jwtService;

    @RequestMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader) {
        
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credentialsBytes = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credentialsBytes);
            String[] parts = credentials.split(":", 2);
            String username = parts[0];
            String password = parts[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtService.generateToken(username);
                return ResponseEntity.ok().body("{\"token\": \"" + token + "\"}");
            } else {
                return ResponseEntity.status(401).body("Invalid credentials");
            }
        }

        return ResponseEntity.status(400).body("Missing Authorization header");
    }
}

