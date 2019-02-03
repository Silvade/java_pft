package ru.stqa.pft.homework;

public class Point
{
    double x;
    double y;

    public Point(double x, double y)
    {
        this.y = y;
        this.x = x;
    }

    public double distance(Point p)
    {
        double x = p.x - this.x;
        double y = p.y - this.y;

        return Math.sqrt(x*x + y*y);
    }
}
