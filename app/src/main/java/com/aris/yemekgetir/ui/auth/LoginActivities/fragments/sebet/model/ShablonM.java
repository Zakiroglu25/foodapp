package com.aris.yemekgetir.ui.auth.LoginActivities.fragments.sebet.model;

public class ShablonM {
    private int note;
    private int price;
    private int extraPrice;
    private int deliveryPrice;
    private int totalPrice;

    public ShablonM(int note, int price, int extraPrice, int deliveryPrice, int totalPrice) {
        this.note = note;
        this.price = price;
        this.extraPrice = extraPrice;
        this.deliveryPrice = deliveryPrice;
        this.totalPrice = totalPrice;
    }

    public ShablonM() {
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(int extraPrice) {
        this.extraPrice = extraPrice;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
