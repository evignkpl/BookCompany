package com.thebookcompany.model;

import lombok.Data;

import java.math.BigDecimal;
@Data

public class Ingredient extends Entity {
    private BigDecimal costPerUnit;
    private int calories;
    private String Vegie;

}
