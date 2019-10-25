package com.aris.yemekgetir.ui.auth.LoginActivities.models;

import androidx.annotation.DrawableRes;

public class Category  {
  private String name;

  @DrawableRes
  private int image;


  public static Category create(){
    return new Category();
  }

  public String getName() {
    return name;
  }

  public Category setName(String name) {
    this.name = name;
    return this;
  }

  public int getImage() {
    return image;
  }

  public Category setImage(int image) {
    this.image = image;
    return this;
  }
}
