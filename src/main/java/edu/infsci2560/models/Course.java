/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import java.net.*; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author faris
 */
@Entity
public class Course {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String courseName;
    protected URL courseLink;
    protected String courseDescription;


    public Course() {
        // this.id = Long.MAX_VALUE;
        this.courseName = courseName;
        this.courseLink = courseLink;
        this.courseDescription = courseDescription;

    }

    public Course(Long id, String courseName, String courseDescription, URL courseLink) {
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseLink = courseLink;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", courseName=" + this.courseName + ", courseDescription=" + this.courseDescription + ", courseLink=" + this.courseLink + " ]";
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
     * @return the courseDescription
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * @param set the courseDescription
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * @return the courseLink
     */
    public URL getCourseLink() {
        return courseLink;
    }

    /**
     * @param set the courseLink
     */
    public void setCourseLink(URL courseLink) {
        this.courseLink = courseLink;
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
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}