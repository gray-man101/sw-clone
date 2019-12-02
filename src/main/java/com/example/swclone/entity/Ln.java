package com.example.swclone.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@Entity
public class Ln {

    @Id
    @GeneratedValue
    private Long id;
    private String dbName;
    private BigDecimal amount;
    private String status;

}
