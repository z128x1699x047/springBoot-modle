package com.zxx.gs.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LabourProject {

    private Integer id;
    private String name;
    private String partLable;
    private BigDecimal price;
    private Integer isSystemStandrd;

}
