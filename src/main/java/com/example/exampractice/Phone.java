package com.example.exampractice;

import javafx.scene.image.Image;

public class Phone {
    private Image phoneImage;
    private String phoneName;

    public Phone(Image phoneImage, String phoneName) {
        this.phoneImage = phoneImage;
        this.phoneName = phoneName;
    }

    public Image getPhoneImage() {
        return phoneImage;
    }
    public void setPhoneImage(Image phoneImage) {
        this.phoneImage = phoneImage;
    }
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}
