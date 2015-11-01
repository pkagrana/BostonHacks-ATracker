package com.example.pratik.bostonhacks;

import java.text.DecimalFormat;

/**
 * Alcohol
 */
public class Alcohol {

    private int age;
    private int weight; //weight must be in grams
    private boolean gender; //True for Male, False for Female
    private int time; //time in minutes since last drink

    public Alcohol(){
        this.age = age;
        this.weight = weight;
        this.gender = true;
    }

    public Alcohol(int age, int weight, int time, boolean gender) {
        this.age = age;
        this.weight = weight;
        this.gender = true;
        this.time = time;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    /**
     * @return weight in grams
     */
    public double getWeight() {
        return this.weight * 453.5923;
    }

    public boolean getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
