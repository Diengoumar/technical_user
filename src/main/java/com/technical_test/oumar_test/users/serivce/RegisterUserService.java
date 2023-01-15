package com.technical_test.oumar_test.users.serivce;

import com.technical_test.oumar_test.users.entities.User;
import com.technical_test.oumar_test.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class RegisterUserService {
    private UserRepository userRepository;

    @Autowired
    public RegisterUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity registerUser(User user){

        Period age= Period.between(user.getBirthDate(), LocalDate.now());
        if(age.getYears()<18 && user.getCountryResidence()!="France"){
            return new ResponseEntity<>("Only a adult French residents are allowed to create an account!",HttpStatus.FORBIDDEN);
        }
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
