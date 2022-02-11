package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;

    public List<User> getAllUsers(){
        List<User> user = new ArrayList<>();
        userrepository.findAll().forEach(user::add);
        return user;
    }
    public Optional<User> getUser(int id){
        return userrepository.findById(id);
    }

    public void createUser(User user) {
        userrepository.save(user);
    }
}
