package com.example.pinaka.data;

public class Events {
    private int image;
    private String name;
    private String location;
    private String address;
    private String organiser;

    public Events(int image, String name, String location, String address, String organiser) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.address = address;
        this.organiser = organiser;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }
}
