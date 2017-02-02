package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by igor on 02.02.2017.
 */
public class SquareTests {

  @Test
  public void testArea() {
    //Тест Площадь квадрата
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);

    //Тест Расстояние между двумя точками
    Point p1 = new Point(-1,7);
    Point p2 = new Point(2,-3);
    Assert.assertEquals(p1.distance(p2), 10.44030650891055);

    Point p3 = new Point(-177,7);
    Point p4 = new Point(21,-13);
    Assert.assertEquals(p3.distance(p4), 199.00753754569197);

    Point p5 = new Point(-17.7,1);
    Point p6 = new Point(21.9,-1.3);
    Assert.assertEquals(p5.distance(p6), 39.66673669461605);
  }
}