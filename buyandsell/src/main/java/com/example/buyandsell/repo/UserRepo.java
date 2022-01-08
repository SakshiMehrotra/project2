package com.example.buyandsell.repo;

import java.util.List;

import com.example.buyandsell.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String>{
    
    // @Override
    // List<User> findAll(); 
    


    
}
