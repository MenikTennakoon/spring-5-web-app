package com.pandora.spring5webapp.model;

import javax.persistence.*;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String address;

    @OneToOne(mappedBy = "Id")
    Book book;

    public Publisher() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
