package com.ozd.AuthentificationBackend.folder.controller.service.impl;

import com.ozd.AuthentificationBackend.folder.controller.model.User;
import com.ozd.AuthentificationBackend.folder.controller.reposotiry.UserRepository;
import com.ozd.AuthentificationBackend.folder.controller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void SaveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> GetUser(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> GetAllUsers() {
        return userRepository.getallUsers();
    }
}
