package ru.stqa.pft.sandbox;

/**
 * Created by igor on 31.01.2017.
 */
public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }
  public double distance(Point p) {
    return Math.sqrt (Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
  }
}

  /**то есть вызывалась эта функция так: distance(point1, point1)
  а теперь один из этих двух объектов становится "ведущим", именно в нём будет вызываться метод, а второй -- ведомым, он будет по прежнему передаваться как параметр:
        point1.distance(point2)
   при этом объект, в котором вызывается метод, внутри этого метода доступен под именем this. а параметры как обычно доступны под теми именами, которые мы им сами дадим**/