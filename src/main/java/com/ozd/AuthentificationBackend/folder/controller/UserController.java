package com.ozd.AuthentificationBackend.folder.controller;

import com.ozd.AuthentificationBackend.folder.controller.model.User;
import com.ozd.AuthentificationBackend.folder.controller.reposotiry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/UC") //Programme Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PutMapping("/users/id={id}")
    public Optional<User> findUserById(@PathVariable(value = "id")int id){
        return userRepository.findById(id);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User u){
        userRepository.save(u);
    }


    @PutMapping("/users/email={email}/passwd={pass}")
    User findUserByEmail(@PathVariable(value = "email") String email,@PathVariable(value = "pass") String pass){
        return userRepository.getInfo(email,pass);
    }



}


