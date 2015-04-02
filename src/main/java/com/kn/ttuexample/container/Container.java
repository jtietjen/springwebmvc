package com.kn.ttuexample.container;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by jan.tietjens on 23.03.2015.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Container")
public class Container {

    @Id
    @GeneratedValue
    private Long id;

    @Column()
    @NotNull
    private String size;

    @Column()
    private String internalId;

    @Column()
    private int weightInKG;

}