package com.dsherli.habit66.service;

import com.dsherli.habit66.model.HabitEntry;
import com.dsherli.habit66.repository.HabitEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HabitEntryService {
    @Autowired
    private HabitEntryRepository habitEntryRepository;

    public List<HabitEntry> getHabitEntriesByUserId(Long userId) {
        return habitEntryRepository.findByUserId(userId);
    }

    public List<HabitEntry> getHabitEntriesByUserIdAndHabitId(Long userId, Long habitId) {
        return habitEntryRepository.findByUserIdAndHabitId(userId, habitId);
    }

    public HabitEntry createHabitEntry(HabitEntry habitEntry) {
        return habitEntryRepository.save(habitEntry);
    }

    public HabitEntry updateHabitEntry(HabitEntry habitEntry) {
        return habitEntryRepository.save(habitEntry);
    }

    public void deleteHabitEntry(Long id) {
        habitEntryRepository.deleteById(id);
    }

    public void saveHabitEntry(HabitEntry habitEntry) {
        habitEntryRepository.save(habitEntry);
    }

    public void deleteHabitEntry(HabitEntry habitEntry) {
        habitEntryRepository.delete(habitEntry);
    }
}
