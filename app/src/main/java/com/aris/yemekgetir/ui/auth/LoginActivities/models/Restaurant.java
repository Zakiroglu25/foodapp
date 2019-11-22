package com.aris.yemekgetir.ui.auth.LoginActivities.models;

import com.aris.yemekgetir.R;

public class Restaurant {

  private String name;
  private double rating;
  private String time;
  private int minimum;
  private int src;


  public static Restaurant create(){
    return new Restaurant().setName("Cafe City").setRating(4.9).setSrc(R.drawable.offer_1).setTime("20-30 deq").setMinimum(0);
  }

  public String getName() {
    return name;
  }

  public Restaurant setName(String name) {
    this.name = name;
    return this;
  }

  public double getRating() {
    return rating;
  }

  public Restaurant setRating(double rating) {
    this.rating = rating;
    return this;
  }

  public String getTime() {
    return time;
  }

  public Restaurant setTime(String time) {
    this.time = time;
    return this;
  }

  public int getMinimum() {
    return minimum;
  }

  public Restaurant setMinimum(int minimum) {
    this.minimum = minimum;
    return this;
  }

  public int getSrc() {
    return src;
  }

  public Restaurant setSrc(int src) {
    this.src = src;
    return this;
  }
}
