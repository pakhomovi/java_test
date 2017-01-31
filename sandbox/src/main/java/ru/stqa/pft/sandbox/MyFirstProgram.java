package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hi("world");
    hi("user");
    hi("xxx");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point(-1,3);
    System.out.println("Расстояние между двумя точками: " + p.x + " : " + p.y + " = " + p.distance());
  }

   public static void hi(String somebody) {
    System.out.println("Hi," + somebody + "!");
  }
}