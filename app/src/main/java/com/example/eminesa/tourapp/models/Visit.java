package com.example.eminesa.tourapp.models;

/**
 * Created by eminesa on 14.12.2017.
 */

public class Visit {
    private int image;
    private int historia;

    public Visit(int image, int historia) {
        this.image = image;
        this.historia = historia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getHistoria() {
        return historia;
    }

    public void setHistoria(int historia) {
        this.historia = historia;
    }
}
