/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author faris
 */
@Entity
public class Orgnization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String orgnizationType;
    protected String numberOfEmpolyee;
    protected String orgnizationTarget;

    @OneToOne
    protected InfoArm infoArm;

    public Orgnization() {

    }

    public Orgnization(String orgnizationType, String numberOfEmpolyee, String orgnizationTarget, InfoArm infoArm) {
        this.orgnizationType = orgnizationType;
        this.numberOfEmpolyee = numberOfEmpolyee;
        this.orgnizationTarget = orgnizationTarget;
        this.infoArm = infoArm;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", orgnizationType=" + this.orgnizationType + ", numberOfEmpolyee=" + this.numberOfEmpolyee + ", orgnizationTarget="+ this.orgnizationTarget + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the orgnizationType
     */
    public String getOrgnizationType() {
        return orgnizationType;
    }

    /**
     * @param orgnizationType the orgnizationType to set
     */
    public void setOrgnizationType(String orgnizationType) {
        this.orgnizationType = orgnizationType;
    }

    /**
     * @return the numberOfEmpolyee
     */
    public String getNumberOfEmpolyee() {
        return numberOfEmpolyee;
    }

    /**
     * @param numberOfEmpolyee the numberOfEmpolyee to set
     */
    public void setNumberOfEmpolyee(String numberOfEmpolyee) {
        this.numberOfEmpolyee = numberOfEmpolyee;
    }

        /**
     * @return the orgnizationType
     */
    public String getOrgnizationTarget() {
        return orgnizationTarget;
    }

    /**
     * @param orgnizationType the orgnizationType to set
     */
    public void setOrgnizationTarget(String orgnizationTarget) {
        this.orgnizationTarget = orgnizationTarget;
    }

    public void setInfoArm(InfoArm infoArm) {
        this.infoArm = infoArm;
    }
}