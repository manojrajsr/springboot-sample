package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class UserController {

    @Autowired
    private  UserService userservice;


    @RequestMapping("/users")
    public List<User> getAllUsers(){
    return userservice.getAllUsers();}

    @RequestMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable int id){
        return userservice.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/user")
    public void createUser(@RequestBody User user){
        userservice.createUser(user);
    }

}









/*
    public usercontroller(userservice userservice) {
        this.userservice = userservice;
    }

    @GetMapping
    public List<user> getuser(){
        return userservice.getuser();
    }
}
*/