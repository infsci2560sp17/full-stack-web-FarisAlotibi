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
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String userName;
    protected String userAge;
    protected String userEmail;
    protected String userResume;
    protected UserGender userGender;
    protected String userPicture;

    // @OneToOne
    // protected InfoArm infoArm;

    public enum UserGender {
        Male,
        Female
    }

    public Profile() {
        // this.id = Long.MAX_VALUE;
        this.userName = null;
        this.userAge = null;
        this.userEmail = null;
        this.userResume = null;
        this.userPicture = null;
        this.userGender = UserGender.Male;
    }

    public Profile(String userName, String userAge, String userEmail, String userResume, UserGender userGender, String userPicture) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userResume = userResume;
        this.userGender = userGender;
        this.userPicture = userPicture;
    }

    @Override
    public String toString() {                                                                                              
        return "[ id=" + this.id + ", userName=" + this.userName + ", userAge=" + this.userAge +", userEmail="+ this.userEmail + ", userResume="+ this.userResume + ", userGender="+ this.userGender +  " ]";
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userAge
     */
    public String getUserAge() {
        return userAge;
    }

    /**
     * @param userAge the userAge to set
     */
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

        /**
     * @return the userAge
     */
    public String getUserEmail() {
        return userEmail;
    }

        /**
     * @param userAge the userAge to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

        /**
     * @return the userResume
     */
    public String getUserResume() {
        return userResume;
    }
        /**
     * @param userResume the userResume to set
     */
    public void setUserResume(String userResume) {
        this.userResume = userResume;
    }

        /**
     * @return the userGender
     */
    public UserGender getUserGender() {
        return userGender;
    }

    /**
     * @param userGender the userGender to set
     */
    public void setUserGender(UserGender userGender) {
        this.userGender = userGender;
    }

    /**
     * @return the userPicture
     */
    public String getUserPicture() {
        return userPicture;
    }

    /**
     * @param userPicture the userPicture to set
     */
    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }
}