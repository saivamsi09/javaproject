package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.UserModel;

public interface UserService {
	
	public UserModel save(UserModel u);
	public  Optional<UserModel>  get(String id);
	public UserModel getByMobile(String mobile);
	public UserModel getByAdher(String adher);
	public UserModel getFullName(String fname);
	
	public UserModel update(UserModel u,String id);
	public void delete(String mobile);
	public List<UserModel> getAll();
	
	

}
