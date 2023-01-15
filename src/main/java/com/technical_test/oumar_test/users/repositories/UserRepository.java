package com.technical_test.oumar_test.users.repositories;

import com.technical_test.oumar_test.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {



}
