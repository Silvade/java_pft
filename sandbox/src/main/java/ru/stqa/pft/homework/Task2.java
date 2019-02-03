package ru.stqa.pft.homework;

public class Task2
{
    public static void main (String[] args)
    {
        Point p1 = new Point(-2.3, 4);
        Point p2 = new Point(8.5, 0.7);
        System.out.println("Расстояние между точками p1(" + p1.x + ", " + p1.y + ") и p2(" + p2.x + ", " + p2.y + ") равно " + distance(p1, p2));

        System.out.println("Расстояние между точками p1(" + p1.x + ", " + p1.y + ") и p2(" + p2.x + ", " + p2.y + ") равно " + p1.distance(p2));
    }

    public static double distance(Point p1, Point p2)
    {
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;

        return Math.sqrt(x*x + y*y);
    }
}
