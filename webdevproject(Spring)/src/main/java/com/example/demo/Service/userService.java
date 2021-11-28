package com.example.demo.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.Model.User;
import com.example.demo.Repository.userRepository;



@Service
@Transactional
public class userService {

@Autowired
userRepository repo;

public userService() {

}

public userService(userRepository repo) {
super();
this.repo = repo;
}



public void registerUser(User user) {
repo.save(user);
}

public Iterable<User> showAllUser() {
return repo.findAll();

}

public User findUser(String username) {
return repo.findByUsername(username);
}

public Iterable<User> deleteUserByUsername(String username){
return repo.deleteByUsername(username);
}

}