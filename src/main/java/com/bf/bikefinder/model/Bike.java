package com.bf.bikefinder.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private Float price;
    private String size; /* Revisar si este campo se pilla de base de datos (preferido) o es una enum de constantes */
    private String description;
    private Integer year;
    private String url_details;
    private Long maker_id;
    private Long category_id;
    private Float weight;
    private String url_image;


    private Bike() {}

    public Bike(final String name, final Float price) {
        this.name = name;
        this.price = price;
    }

}
