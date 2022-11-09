package org.example.springdatajpacourse.controller;

import org.example.springdatajpacourse.entity.User;
import org.example.springdatajpacourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping({"/", "/getall"})
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getbyid")
    public User getUserById(Long id){
        return userService.getUserById(id);
    }

}
