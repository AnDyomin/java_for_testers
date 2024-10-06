package ru.test.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalculateArea () {
        var s = new Square(5.0);

        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }
    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void canCalculatePerimeterTriangle() {
        Assertions.assertEquals(12.0, new Triangle(3,4,5).perimeter());
    }

    @Test
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(6.0, new Triangle(3,4,5).areaTriangle());
    }
}
