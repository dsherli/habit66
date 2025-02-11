package com.dsherli.habit66.repository;

import com.dsherli.habit66.model.HabitUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<HabitUser, Long> {

    // Optional is a container object which may or may not contain a non-null value, this one is used to find a user by username
    Optional<HabitUser> findByUsername(String username);

    // Find a user by email
    Optional<HabitUser> findByEmail(String email);

    // Find a user by username or email (used for login)
    Optional<HabitUser> findByUsernameOrEmail(String username, String email);
}
