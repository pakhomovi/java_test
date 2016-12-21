package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    //String somebody = "world";
    //System.out.println("hi, " + somebody + "!");
    //double l = 8;
    //double s = l * l;
    //System.out.println("Площадь квадрата со стороной " + l + "=" + s);
    hi("world");
    hi("user");
    hi("xxx");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
  }

  public static void hi(String somebody) {
    System.out.println("Hi," + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a*b;
  }


}