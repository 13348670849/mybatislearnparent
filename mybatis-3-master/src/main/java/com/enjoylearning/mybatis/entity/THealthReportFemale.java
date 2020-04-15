package com.enjoylearning.mybatis.entity;

import java.math.BigDecimal;

public class THealthReportFemale extends BaseEntity {
    private Integer id;

    private String item;

    private BigDecimal score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}