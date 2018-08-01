package com.example.knbhatt.nainitour1;


public class Names {
    private String mnameTranslation;
    private String mrelationTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Names(String nameTranslation, String relationTranslation, int imageResourceId) {
        mnameTranslation = nameTranslation;
        mrelationTranslation = relationTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getMnameTranslation() {

        return mnameTranslation;
    }

    public String getMrelationTranslation() {

        return mrelationTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
}
