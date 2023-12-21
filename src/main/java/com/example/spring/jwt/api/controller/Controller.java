package com.example.spring.jwt.api.controller;

import com.example.spring.jwt.api.entity.AuthRequestDTO;
import com.example.spring.jwt.api.entity.JwtResponseDTO;
import com.example.spring.jwt.api.service.JwtService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@PostMapping("/api/v1/login")
public JwtResponseDTO AuthenticateAndGetToken(@RequestBody AuthRequestDTO authRequestDTO){

    Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDTO.getUsername(), authRequestDTO.getPassword()));
    if (authentication.is) {
        JwtService jwtService;
        return JwtResponseDTO.builder()
                .accessToken(jwtService.GenerateToken(authRequestDTO.getUsername()).build();
    } else {
        throw new UsernameNotFoundException("invalid user request..!!");
    }
}
