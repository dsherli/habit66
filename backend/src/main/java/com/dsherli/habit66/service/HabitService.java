package com.dsherli.habit66.service;

import com.dsherli.habit66.model.Habit;
import com.dsherli.habit66.repository.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HabitService {
    @Autowired
    private HabitRepository habitRepository;

    public List<Habit> getHabitsByUserId(Long userId) {
        return habitRepository.findByUserId(userId);
    }

    public List<Habit> getHabitsByUserIdAndName(Long userId, String name) {
        return habitRepository.findByUserIdAndName(userId, name);
    }

    public Habit createHabit(Habit habit) {
        return habitRepository.save(habit);
    }

    public Habit updateHabit(Habit habit) {
        return habitRepository.save(habit);
    }

    public void deleteHabit(Long id) {
        habitRepository.deleteById(id);
    }

    public void saveHabit(Habit habit) {
        habitRepository.save(habit);
    }

    public void deleteHabit(Habit habit) {
        habitRepository.delete(habit);
    }
}
