package com.example.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Shellee on 4/17/2017.
 */

@Entity
@Table(name = "CLAIM_CENTERS")
public class ClaimCenter {

    @Id
    @SequenceGenerator(name = "CLAIM_CENTER_ID_GENERATOR", sequenceName = "CLAIM_CENTERS_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLAIM_CENTER_ID_GENERATOR")
    @Column(name = "NO")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "center", cascade = {CascadeType.ALL})
    private Set<Phone> phones;

    @Transient
    private int viewCount = 0;

    public ClaimCenter() {
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void incrementViewCount() {
        this.viewCount++;
    }

    public String toString() {
        return this.getName();
    }
}

