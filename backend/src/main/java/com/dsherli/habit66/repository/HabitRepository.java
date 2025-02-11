package com.dsherli.habit66.repository;

import com.dsherli.habit66.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
    List<Habit> findByUserId(Long userId);

    List<Habit> findByUserIdAndName(Long userId, String name);
}
