package org.example.repository;

import java.util.Optional;

import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //For sign-in: find user by email
    Optional<User> findByEmail(String email);

    // For sign-up: check if email already exists
    boolean existsByEmail(String email);

}
