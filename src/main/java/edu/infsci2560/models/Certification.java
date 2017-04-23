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
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String certificationType;
    protected String certificationName;
    // protected CertificationOrgnizor certificationOrgnizor;
    protected String certificationOrgnizor;

    // public enum CertificationOrgnizor {
    //     ELearnSecurity,
    //     International_Association_of_Privacy_Professionals,
    //     Cisco,
    //     CompTIA,
    //     Offensive_Security,
    //     International_Information_System_Security_Certification_Consortium
    // }

    public Certification() {
        this.id = Long.MAX_VALUE;
        this.certificationName = null;
        this.certificationType = null;
        // this.certificationOrgnizor = CertificationOrgnizor.Cisco;
        this.certificationOrgnizor = null;
    }

    // public Certification(String certificationType, String certificationName, CertificationOrgnizor certificationOrgnizor) {
    public Certification(String certificationType, String certificationName, String certificationOrgnizor) {
        this.certificationType = certificationType;
        this.certificationName = certificationName;
        this.certificationOrgnizor = certificationOrgnizor;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", certificationType=" + this.certificationType + ", certificationName=" + this.certificationName + ", certificationOrgnizor="+ this.certificationOrgnizor + " ]";
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
     * @return the certificationType
     */
    public String getCertificationType() {
        return certificationType;
    }

    /**
     * @param certificationType the certificationType to set
     */
    public void setCertificationType(String certificationType) {
        this.certificationType = certificationType;
    }

    /**
     * @return the certificationName
     */
    public String getCertificationName() {
        return certificationName;
    }

    /**
     * @param certificationName the certificationName to set
     */
    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

        /**
     * @return the certificationOrgnizor
     */
     
    // public CertificationOrgnizor getCertificationOrgnizor() {
    public String getCertificationOrgnizor() {
        return certificationOrgnizor;
    }

    /**
     * @param certificationOrgnizor the certificationOrgnizor to set
     */

    // public void setCertificationOrgnizor(CertificationOrgnizor certificationOrgnizor) {
    public void setCertificationOrgnizor(String certificationOrgnizor) {
        this.certificationOrgnizor = certificationOrgnizor;
    }
}