package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.userService;

@RestController

public class userController {
@Autowired
userService service;

@PostMapping("/add-user")
@Transactional
@CrossOrigin
public String registerUser(@RequestBody User user, HttpServletRequest request) {
service.registerUser(user);
return "Hello "+user.getFirstname()+", your resistration is successfull";
}
@GetMapping("/show-user")
@Transactional
@CrossOrigin
public Iterable<User> getUser(){
return service.showAllUser();
}

@GetMapping("/search/{username}")
@Transactional
@CrossOrigin
public User searchUser(@PathVariable String username) {
return service.findUser(username);
}

@GetMapping("delete/{username}")
@Transactional
@CrossOrigin
public Iterable<User> deleteUser(@PathVariable String username){
return service.deleteUserByUsername(username);
}

}