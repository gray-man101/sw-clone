package com.example.swclone.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@Entity
public class Pm {

    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal amount;
    @ManyToOne
    private Ln ln;

}
