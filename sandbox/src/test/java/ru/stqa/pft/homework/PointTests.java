package ru.stqa.pft.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests
{
    @Test
    public void testDistanceWithIntegerValues()
    {
        Point p1 = new Point(2, -1);
        Point p2 = new Point(-1, 3);

        assert p2.distance(p1) == 5;
    }

    @Test
    public void testDistanceWithDoubleValues()
    {
        Point p1 = new Point(5.75, 1.17);
        Point p2 = new Point(3.75, 2.67);

        Assert.assertEquals(p1.distance(p2), 2.5);
    }

    @Test
    public void testDistanceWithZeroPoint()
    {
        Point p1 = new Point(4, 3);
        Point p2 = new Point(0, 0);

        Assert.assertTrue(p2.distance(p1) == 5.0);
    }

    @Test
    public void testDistanceWithZeroPoints()
    {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);

        Assert.assertTrue(p1.distance(p2) == 0.0, "Zero points test fail");
    }
}
