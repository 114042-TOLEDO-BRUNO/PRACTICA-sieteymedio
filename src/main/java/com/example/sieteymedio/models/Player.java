package com.example.sieteymedio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private Long id;
    private String userName;
    private String password;
    private String email;
    private String avatar;
    private BigDecimal balanceChips;
}
