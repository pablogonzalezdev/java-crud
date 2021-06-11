package com.example.springbootdemo.models;

import javax.persistence.*;

@Entity
@Table(name = "sneaker")
public class SneakerModel {

    /*
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique = true, nullable = false)
     */
    @Id
    private Integer id;

    @Column
    private String brand;

    @Column
    private String model;

    // GETTER and SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
