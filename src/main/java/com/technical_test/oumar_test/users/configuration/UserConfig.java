package com.technical_test.oumar_test.users.configuration;

import com.technical_test.oumar_test.users.entities.User;
import com.technical_test.oumar_test.users.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User a=new User("oumar", LocalDate.of(1997, Month.APRIL,30),"france");
            repository.saveAll(List.of(a));
        };
    }


}
