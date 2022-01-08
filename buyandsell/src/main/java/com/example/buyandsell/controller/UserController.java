package com.example.buyandsell.controller;

import java.util.List;

import com.example.buyandsell.model.User;
import com.example.buyandsell.repo.UserRepo;
import com.example.buyandsell.response.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class UserController {
    @Autowired
    UserRepo userRepo;
    
    @PostMapping("/userRegister")
    public Response addUser(@RequestBody User user)
    {
        if(userRepo.count()>0)
        {
            List<User> list= userRepo.findAll();
            for (User user2 : list) {
                if(user2.getEmail().equals(user.getEmail())){
                    return new Response(400, "Already exists", user);
                }
                }
            }
            userRepo.save(user);
        return new Response(200, "registration successfull", user);
    }
    @PostMapping("/userLogin")
    public Response addToLogin(@RequestBody User user)
    {

    System.out.println(userRepo.count());
    if(userRepo.count()>0)
        {
            System.out.println("string ");
            List<User> list= userRepo.findAll();
            System.out.println(list);
            // for (User user2 : list) {
            //     if(user2.getEmail().equals(user.getEmail())){
            //         return new Response(400, "Already exists", user);
            //     }
            //     }
            return new Response(200, "registration successfull", list);
            } 
    //userRepo.save(user);
        return new Response(200, "registration successfull", user);
    }
    }
            

    
         
         

    