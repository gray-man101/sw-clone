package com.example.swclone.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NewPmDTO {
    private BigDecimal amount;
    private Long lnId;
}
