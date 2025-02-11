package com.dsherli.habit66.service;

import com.dsherli.habit66.model.HabitUser;
import com.dsherli.habit66.repository.HabitUserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HabitUserService {
    @Autowired
    private HabitUserRepository habitUserRepository;

    public HabitUser createHabitUser(HabitUser habitUser) {
        return habitUserRepository.save(habitUser);
    }

    public HabitUser updateHabitUser(HabitUser habitUser) {
        return habitUserRepository.save(habitUser);
    }

    public void deleteHabitUser(Long id) {
        habitUserRepository.deleteById(id);
    }

    public void saveHabitUser(HabitUser habitUser) {
        habitUserRepository.save(habitUser);
    }

    public void deleteHabitUser(HabitUser habitUser) {
        habitUserRepository.delete(habitUser);
    }
}
