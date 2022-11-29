package com.sharktank.xharktank.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "entrepreneur")
public class Entrepreneur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Column(name = )

    @Column(name = "entrepreneur")
    private String entrepreneur;
    @Column(name = "pitchTitle")
    private String pitchTitle;
    @Column(name = "pitchIdea")
    private String pitchIdea;
    @Column(name = "askAmount")
    private float askAmount;
    @Column(name = "equity")
    private float equity;



}
