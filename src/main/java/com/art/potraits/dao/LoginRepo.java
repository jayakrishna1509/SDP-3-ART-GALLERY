package com.art.potraits.dao;

import org.springframework.data.repository.CrudRepository;

import com.art.potraits.model.Login;

public interface LoginRepo extends CrudRepository<Login, String>
{
	
}