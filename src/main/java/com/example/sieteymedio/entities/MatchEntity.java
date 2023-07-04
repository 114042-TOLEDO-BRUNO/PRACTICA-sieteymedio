package com.example.sieteymedio.entities;


import com.example.sieteymedio.models.MatchStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "matches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "match")
    private List<RoundEntity> rounds;

    @ManyToOne
    @JoinColumn(name="player_id")
    private PlayerEntity player;

    @Column
    @Enumerated(EnumType.STRING)
    private MatchStatus matchStatus;
}
