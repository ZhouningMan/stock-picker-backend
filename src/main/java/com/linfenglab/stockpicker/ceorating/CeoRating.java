package com.linfenglab.stockpicker.ceorating;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CeoRating {
    @Id
    @GeneratedValue
    private Integer id;

    private int rank;

    private String name;

    private String employer;

    private CeoRating(){}

    public CeoRating(int rank, String name, String employer) {
        this.rank = rank;
        this.name = name;
        this.employer = employer;
    }
}
