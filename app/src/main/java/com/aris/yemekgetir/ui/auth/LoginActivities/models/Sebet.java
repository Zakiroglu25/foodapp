package com.aris.yemekgetir.ui.auth.LoginActivities.models;

public class Sebet {
    private String name;
    private int price;
    private String note;
    private int orderPrice;

    public Sebet(String name, int price, String note, int orderPrice) {
        this.name = name;
        this.price = price;
        this.note = note;
        this.orderPrice = orderPrice;
    }

    public Sebet() {
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
}
