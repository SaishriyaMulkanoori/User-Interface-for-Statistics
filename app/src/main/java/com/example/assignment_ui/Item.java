package com.example.assignment_ui;

public class Item {
    String name;
    String time;
    String cost;
    int image;

    public Item(String name, String time, String cost, int image) {
        this.name = name;
        this.time = time;
        this.cost = cost;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
