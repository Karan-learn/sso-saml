package com.comakeit.sso.saml.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SSOController {

	@GetMapping("login")
	public String ssoLogin() {
		Object ob =SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(ob.toString());;
		SecurityContextHolder.getContext().getAuthentication().getCredentials();
		String n =SecurityContextHolder.getContext().getAuthentication().getName();
		return  n + "logged in successfully";
	}
	
	@GetMapping
	public String sso() {
		return "SAML works";
	}
}
