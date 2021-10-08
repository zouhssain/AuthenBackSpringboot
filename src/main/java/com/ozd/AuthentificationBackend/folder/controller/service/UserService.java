package com.ozd.AuthentificationBackend.folder.controller.service;

import com.ozd.AuthentificationBackend.folder.controller.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public void SaveUser(User user); // pour sauvgarder un user
    public Optional<User> GetUser(Integer id);
    public List<User> GetAllUsers();

}
