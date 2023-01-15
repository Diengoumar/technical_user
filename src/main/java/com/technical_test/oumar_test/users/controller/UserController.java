package com.technical_test.oumar_test.users.controller;



import com.technical_test.oumar_test.users.entities.User;
import com.technical_test.oumar_test.users.serivce.DetailsUserService;
import com.technical_test.oumar_test.users.serivce.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class UserController {
    private final DetailsUserService detailsUserService;
    private final RegisterUserService registerUserService;

    @Autowired
    public UserController(DetailsUserService detailsUserService,RegisterUserService registerUserService) {
        this.detailsUserService = detailsUserService;
        this.registerUserService=registerUserService;
    }


    @GetMapping("/details")
    public List<User> displayUsers(){
        return detailsUserService.getUsers();
    }
   @PostMapping("/register")
    public ResponseEntity registerNewUser(@RequestBody User user){
       return registerUserService.registerUser(user);
    }

}
