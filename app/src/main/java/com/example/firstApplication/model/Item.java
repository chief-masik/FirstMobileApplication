package com.example.firstApplication.model;

public class Item {
    private int image;
    private String nameLake;
    public Item(int image, String nameLake) {
        this.image = image;
        this.nameLake = nameLake;
    }
    public int getImage() {
        return image;
    }
    public String getNameItem() {
        return nameLake;
    }
}