package com.example.bmicon;

public class bmi {
    private float height,weight;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float Cal(){
        float bmi;
        float meter = conversion();
        bmi = weight/(meter * meter);
        return bmi;
    }

    public float conversion(){
        float meter;
        meter = height/100;
        return meter;
    }
}