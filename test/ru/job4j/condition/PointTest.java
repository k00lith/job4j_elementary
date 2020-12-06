package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2.8, 0.03));
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 2, 5);
        Point b = new Point(3, 4, 8);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(4.1, 0.1));
    }
}
