package com.dsherli.habit66.repository;

import com.dsherli.habit66.model.HabitUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<HabitUser, Long> {
    HabitUser findByUsername(String username);
    HabitUser findByEmail(String email);
    
}
