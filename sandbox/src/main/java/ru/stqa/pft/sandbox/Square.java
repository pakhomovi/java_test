package ru.stqa.pft.sandbox;

/**
 * Created by igor on 21.12.2016.
 */
public class Square {

  public double l;

  public Square(double l) {
    this.l = l;
  }


  public double area() {
    return this.l * this.l;
  }
}
