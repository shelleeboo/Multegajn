package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "PHONES")
@IdClass(PhoneId.class)
public class Phone implements Serializable {

    @Id @Column(name="NAME_ID", unique = false) private Integer id;
    @Id @Column(name="PHONE_SEQ") private Integer sequence;
    @Id @Column(name="ADDR_SEQ") private Integer addressSequence;
    @Id @Column(name="NAME_TYPE") private String type;

    @Column(name = "PHONEA")
    private String phoneA;
    @Column(name = "PHONEB")
    private String phoneB;
    @Column(name = "PHONEC")
    private String phoneC;

    @ManyToOne
    @JoinColumns({  @JoinColumn(name = "NAME_ID", referencedColumnName = "NO",insertable = false, updatable = false) })
    private ClaimCenter center;

    public Phone() {
    }

    public String getPhoneA() {
        return phoneA;
    }

    public void setPhoneA(String phoneA) {
        this.phoneA = phoneA;
    }

    public String getPhoneB() {
        return phoneB;
    }

    public void setPhoneB(String phoneB) {
        this.phoneB = phoneB;
    }

    public String getPhoneC() {
        return phoneC;
    }

    public void setPhoneC(String phoneC) {
        this.phoneC = phoneC;
    }

    @Override
    public String toString() {
        return this.getType();
    }
    public Integer getAddressSequence() {
        return addressSequence;
    }

    public void setAddressSequence(Integer addressSequence) {
        this.addressSequence = addressSequence;
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



    public ClaimCenter getCenter() {
        return center;
    }

    public void setCenter(ClaimCenter center) {
        this.center = center;
    }
}
