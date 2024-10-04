package com.sisterslab.goodreadsapp.repository;

import com.sisterslab.goodreadsapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String name);

    Optional<User> findByUserName(String username);

    Optional<User> findByUsername(String username);
}
