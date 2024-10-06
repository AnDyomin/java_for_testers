package ru.test.geometry;

import ru.test.geometry.figures.Rectangle;
import ru.test.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {

        Square.printSquareArea(7.);
        Square.printSquareArea(2.);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(2.0, 4.0);
    }

}