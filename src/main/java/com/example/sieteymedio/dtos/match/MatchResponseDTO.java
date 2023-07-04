package com.example.sieteymedio.dtos.match;


import com.example.sieteymedio.dtos.player.PlayerResponseDTO;
import com.example.sieteymedio.dtos.round.RoundResponseDTO;
import com.example.sieteymedio.models.MatchStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchResponseDTO {

    private Long id;
    private List<RoundResponseDTO> rounds;
    private PlayerResponseDTO player;
    private MatchStatus matchStatus;
}
