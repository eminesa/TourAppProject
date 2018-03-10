package com.example.eminesa.tourapp.models;

/**
 * Created by eminesa on 14.12.2017.
 */

public class Restaurant {
    private int image;
    private int name;
    private int knowladge;

    public Restaurant(int image, int name, int knowladge) {
        this.image = image;
        this.name = name;
        this.knowladge = knowladge;
    }

    public int getKnowladge() {
        return knowladge;
    }

    public void setKnowladge(int knowladge) {
        this.knowladge = knowladge;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
