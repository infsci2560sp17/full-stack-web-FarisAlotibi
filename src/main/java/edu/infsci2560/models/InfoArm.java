/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author faris
 */
@Entity
public class InfoArm {

    private static final long serialVersionUID = 1L;

    // public enum TicketType {
    //     Network_Security,
    //     Software_Security,
    //     Hardware_Security,
    //     Information_Policy_Security
    // }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String ticketTitle;
    // protected TicketType ticketType;
    protected String ticketType;
    @OneToOne(targetEntity=Orgnization.class, mappedBy="infoArm", cascade=CascadeType.ALL)
    protected Orgnization orgnization;  // orgnization details
    protected String responseTicket;

    public InfoArm() {
        this.id = Long.MAX_VALUE;
        this.ticketTitle = null;
        // this.ticketType = TicketType.Network_Security;
        this.ticketType = "Undefined";
        this.responseTicket = "Not yet";
    }

    // public InfoArm(String ticketTitle, TicketType ticketType) {
    public InfoArm(String ticketTitle, String ticketType, String responseTicket) {
        this.ticketTitle = ticketTitle;
        this.ticketType = ticketType;
        this.responseTicket = responseTicket;
    }

    @Override
    public String toString() {
        String var = String.format(
            "InfoArm[id=%d, ticketTitle='%s',ticketType='%s', responseTicket='%s', orgnization='%s']%n", this.id, this.ticketTitle,
             this.ticketType, this.responseTicket, this.orgnization.toString());
        /*return "[ id=" + this.id + ", ticketTitle=" + this.ticketTitle + ", ticketType=" + this.ticketType + " ]";*/
        return var;
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
     * @return the name
     */
    public String getTicketTitle() {
        return ticketTitle;
    }

    /**
     * @param ticketTitle the name to set
     */
    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }

    /**
     * @return the TicketType
     */
     
    // public TicketType getTicketType() {
    public String getTicketType() {
        return ticketType;
    }

    /**
     * @param ticketType the ticketType to set
     */

    // public void setTicketType(TicketType ticketType) {
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Orgnization getOrgnization() {
        return orgnization;
    }

    public void setOrgnization(Orgnization orgnization) {
        this.orgnization = orgnization;
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
     * @return the responseTicket
     */
    public String getResponseTicket() {
        return responseTicket;
    }

    /**
     * @param responseTicket the responseTicket to set
     */
    public void setResponseTicket(String responseTicket) {
        this.responseTicket = responseTicket;
    }
}
