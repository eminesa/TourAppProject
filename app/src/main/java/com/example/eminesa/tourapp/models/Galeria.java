package com.example.eminesa.tourapp.models;

/**
 * Created by eminesa on 14.12.2017.
 */

public class Galeria {
    private int image;
    private int name;

    public Galeria(int image, int name) {
        this.image = image;
        this.name = name;
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
