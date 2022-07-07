package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	//Para injetar dependencia e já instanciar o objeto
	@Autowired
	private UserRepository repository;
	
	//GetMapping para mostrar ao navegador que está buscando algo
	@GetMapping
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
	}
}
