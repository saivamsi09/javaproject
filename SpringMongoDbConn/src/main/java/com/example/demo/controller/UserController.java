package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping(value="/save")
	public UserModel save(@RequestBody UserModel u) {
		
		System.out.println(u.getFullName()+"========="+u.getMobile());
		return service.save(u);
		
	}
	@GetMapping(value="/getById/{id}")
	public Optional<UserModel> getById(String id){
		return service.get(id);
	}
	@GetMapping(value="/getByMobile/{mobile}")
	public UserModel getByMobile(String mobile){
		return service.getByMobile(mobile);
	}
	
	@GetMapping(value="/getByAdher/{adher}")
	public UserModel getByAdher(String adher){
		return service.getByAdher(adher);
	}
	@GetMapping(value="/getByFullName/{fname}")
	public UserModel getByFullName(String fname){
		return service.getFullName(fname);
	}
	@PutMapping(value="/update")
	public UserModel update(@PathVariable String id,@RequestBody UserModel u) {
		return service.update(u, id);
	}
	
	

}
