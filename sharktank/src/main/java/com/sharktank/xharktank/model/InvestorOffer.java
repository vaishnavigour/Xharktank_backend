package com.sharktank.xharktank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "investorOffer")
public class InvestorOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "investor")
    private String investor;

    @Column(name = "amount")
    private float amount;

    @Column(name = "equity")
    private float equity;

    @Column(name = "comment")
    private String comment;
}
