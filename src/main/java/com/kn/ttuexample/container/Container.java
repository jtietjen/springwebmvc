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
    @NotNull
    private String internalId;

    @Column()
    private int weightInKG;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public int getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(int weightInKG) {
        this.weightInKG = weightInKG;
    }
}