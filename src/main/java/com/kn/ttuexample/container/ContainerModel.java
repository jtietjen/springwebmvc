package com.kn.ttuexample.container;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by xubuntu on 02.04.15.
 */
public class ContainerModel {

    private static final String INTERNAL_ID = "{internal.id}";

    @NotEmpty
    private String size;

    @NotEmpty
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
