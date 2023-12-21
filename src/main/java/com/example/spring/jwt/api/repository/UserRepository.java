package com.example.spring.jwt.api.repository;

import org.springframework.security.core.userdetails.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String username);

}
