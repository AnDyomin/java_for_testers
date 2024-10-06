package ru.test.geometry;

import ru.test.geometry.figures.Rectangle;
import ru.test.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {

        Square.printSquareArea(new Square(7.));
        Square.printSquareArea(new Square(2.));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(2.0, 4.0);
    }

}
