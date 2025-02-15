package ru.job4j.tracker.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

   private Point point1;
   private Point point2;

   @BeforeEach
   public void setUp() {
       point1 = new Point(0, 0);
       point2 = new Point(0, 2);
    }

    @Test
    void distance() {
        double ex = 2.0;
        double result = point1.distance(point2);
        assertEquals(ex, result);
    }
}