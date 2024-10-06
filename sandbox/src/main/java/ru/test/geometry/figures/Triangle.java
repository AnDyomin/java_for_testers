package ru.test.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) {

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public double areaTriangle() {
        var p = poluPerimeter(this.a,this.b,this.c);
        return sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    private static double poluPerimeter(double a, double b, double c) {
        return 0.5 * (a + b + c);
    }
}
