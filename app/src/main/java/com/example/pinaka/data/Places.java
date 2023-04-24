package com.example.pinaka.data;

public class Places {
    private int url;
    private String name;

    public Places(int url, String name) {
        this.url = url;
        this.name = name;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
