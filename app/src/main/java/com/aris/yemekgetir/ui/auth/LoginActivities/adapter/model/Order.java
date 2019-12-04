package com.aris.yemekgetir.ui.auth.LoginActivities.adapter.model;

public class Order {
    private String name;

    public Order(String name, String price, int image) {
        this.name = name;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}