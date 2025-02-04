package com.dsherli.habit66.model;

import jakarta.persistence.*;
import lombok.*;
import com.dsherli.habit66.model.HabitUser;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int streak;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private HabitUser user;
}
