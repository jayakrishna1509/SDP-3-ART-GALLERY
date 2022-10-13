package com.art.potraits.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.art.potraits.dao.RegisterRepo;
import com.art.potraits.model.Login;

@Controller
public class RegisterCotroller 
{
	@Autowired
	RegisterRepo repo;
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping("/addActor")
	public String addActor(Login actor)
	{
		repo.save(actor);
		return "login";
	}
}
