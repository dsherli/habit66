package com.dsherli.habit66.repository;

import com.dsherli.habit66.model.HabitEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitEntryRepository extends JpaRepository<HabitEntry, Long> {

    // Find all habit entries by user id
    List<HabitEntry> findByUserId(Long userId);

    // Find all habit entries by user id and habit id
    List<HabitEntry> findByUserIdAndHabitId(Long userId, Long habitId);
}
