package com.appslab;

public class Triangle {
    int a = 3;
    int b = 4;
    int c = 5;
    int s = ((a + b + c )/2);
    int z = (s*(s -a )*(s -b)*(s -c));
    double Perimeter = (a + b + c);
    double Area = Math.sqrt(z);


    public void Triangle(double Area, double Perimeter){
       this.Perimeter = Perimeter;
       this.Area = Area;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }
}
