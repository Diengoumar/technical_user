package com.technical_test.oumar_test.users.serivce;

import com.technical_test.oumar_test.users.entities.User;
import com.technical_test.oumar_test.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DetailsUserService {
    private UserRepository userRepository;

        @Autowired
    public DetailsUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

}
