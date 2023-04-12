package com.can_erysr.wondersoftheworld;

import java.io.Serializable;

public class Wonders implements Serializable{



    String name;
    String country;
    String details;
    int image;

    public Wonders(String name, String country, String details, int image) {
        this.name = name;
        this.country = country;
        this.details = details;
        this.image = image;
    }
}
