package com.week3.designpatterns.structural.proxy;

public class ImageProxy implements Image{
    private RealImage realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // lazy loading
        }
        realImage.display();
    }
}
