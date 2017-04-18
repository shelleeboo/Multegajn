package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESSES")
@IdClass(AddressId.class)
public class Address implements Serializable {

    @Id @Column(name="NAME_ID", unique = false)
    private Integer id;
    @Id @Column(name="ADDR_SEQ")
    private Integer sequence;
    @Id @Column(name="NAME_TYPE")
    private String type;
    @Column(name = "ADDR1")
    private String streetAddress;

    @ManyToOne
    @JoinColumns({  @JoinColumn(name = "NAME_ID", referencedColumnName = "NO",insertable = false, updatable = false) })
    private ClaimCenter center;

    public Address() {
    }

    @Override
    public String toString() {
        return this.getStreetAddress();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

   public ClaimCenter getCenter() {
        return center;
    }

    public void setCenter(ClaimCenter center) {
        this.center = center;
    }
}
