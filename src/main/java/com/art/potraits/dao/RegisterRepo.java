package com.art.potraits.dao;

import org.springframework.data.repository.CrudRepository;

import com.art.potraits.model.Login;

public interface RegisterRepo extends CrudRepository<Login, String>
{

}