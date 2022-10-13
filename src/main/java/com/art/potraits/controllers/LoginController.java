package com.art.potraits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.art.potraits.dao.LoginRepo;
import com.art.potraits.model.Login;


public class LoginController 
{
	@Autowired
	LoginRepo repo;
	
	@RequestMapping("/login")
	public String register()
	{
		return "login";
	}
	
	@RequestMapping("/addActor")
	public String addActor(Login actor)
	{
		System.out.println(actor);
		return "login";
	}
}