package com.example.belgradeguide;



public class Attraction {
    private String name;
    private String description;
    private String contact;
    private int imageResourceId;


    public Attraction(String name, String contact, String description, int imageResourceId) {

        this.name = name;
        this.contact = contact;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getContact() {
        return contact;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
