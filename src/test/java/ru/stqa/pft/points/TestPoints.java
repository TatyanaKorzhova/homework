package ru.stqa.pft.points;

import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.assertEquals;

public class TestPoints {

        @Test
        public void points_test() {
                Point p1 = new Point(3, 4);
                Point p2 = new Point(5, 6);
                double actualResult = p2.distance(p1);
                double expectedResult = 2.82;
                assertEquals(expectedResult, actualResult, 2e-2);
        }
}