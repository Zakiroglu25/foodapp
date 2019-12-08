package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.model;

import androidx.annotation.DrawableRes;

public class ModelHeader {
    private String name;
    private int price;
    private int num;

    @DrawableRes
    private int img;

    public ModelHeader() {
        this.name = name;
        this.price = price;
        this.num = num;
        this.img = img;
    }

    public static ModelHeader create() {
        return new ModelHeader();
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
