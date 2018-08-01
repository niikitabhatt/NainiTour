package com.example.knbhatt.nainitour1;

/**
 * Created by KN Bhatt on 7/25/2018.
 */
public class data {
    private String placename;
    private String address;
    private  String timing;
    private int image;

    public data() {
    }

    public data(String placename, String address, String timing, int image) {
        this.placename = placename;
        this.address = address;
        this.timing = timing;
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public String getPlacename() {
        return placename;
    }

    public String getTiming() {
        return timing;
    }

    public int getImage() {
        return image;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
