package com.aris.yemekgetir.ui.auth.LoginActivities.models;

public class Offer {

  private int resSource;


  public static Offer create(){
    return new Offer();
  }

  public int getResSource() {
    return resSource;
  }

  public Offer setResSource(int resSource) {
    this.resSource = resSource;
    return this;
  }
}
