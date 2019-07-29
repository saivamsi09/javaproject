package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;
@Repository
public interface UserRepo extends MongoRepository<UserModel,String>{
	
	
	public UserModel findByMobile(String mobile);
	public UserModel findByAdher(String adher);
	public UserModel findByFullName(String fname);
	

}
