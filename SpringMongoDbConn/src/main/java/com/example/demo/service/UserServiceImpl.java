package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserModel save(UserModel u) {
		System.out.println(u.getFullName()+"========="+u.getMobile());
		return repo.save(u);
	}

	@Override
	public UserModel update(UserModel u, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		UserModel entity=getByMobile(id);
		
		repo.delete(entity);
		
	}

	@Override
	public List<UserModel> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public UserModel getByMobile(String mobile) {
		// TODO Auto-generated method stub
		return repo.findByMobile(mobile);
	}

	@Override
	public UserModel getByAdher(String adher) {
		// TODO Auto-generated method stub
		return repo.findByAdher(adher);
	}

	@Override
	public UserModel getFullName(String fname) {
		// TODO Auto-generated method stub
		return repo.findByFullName(fname);
	}

	@Override
	public Optional<UserModel> get(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
