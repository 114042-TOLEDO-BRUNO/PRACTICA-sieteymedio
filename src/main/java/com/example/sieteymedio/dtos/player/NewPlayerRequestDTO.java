package com.example.sieteymedio.dtos.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewPlayerRequestDTO {

    @NotNull
    @JsonProperty("user_name")
    private String userName;

    @NotNull
    private String password;


    // TODO: Validar que email tenga un formato valido
    @NotNull
    private String email;

}
