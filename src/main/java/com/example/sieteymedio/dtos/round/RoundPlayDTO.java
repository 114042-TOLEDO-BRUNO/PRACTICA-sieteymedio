package com.example.sieteymedio.dtos.round;


import com.example.sieteymedio.models.RoundDecision;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoundPlayDTO {

    @NotNull
    @JsonProperty("player_id")
    private Long playerId;

    @NotNull
    @JsonProperty("decision")
    private RoundDecision decision;
}
