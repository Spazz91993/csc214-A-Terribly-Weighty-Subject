package org.example;

public class Converter {
  // Your code goes here
  public String toPounds(int oz){
    double lbs = oz / 16.0;
    return String.format("%.4f lbs", lbs);
  }

  public String toPoundsAndOunces(int oz){
    int lbs = oz / 16;
    int remainder = oz % 16;
    return String.format("%d lbs %d oz", lbs, remainder);
  }
}