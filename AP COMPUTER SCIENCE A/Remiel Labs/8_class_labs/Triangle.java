//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
    private int sideA, sideB, sideC;
    private double perimeter;
    private double s ;

    public Triangle(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public void calcPerimeter( )
    {
        perimeter = sideA + sideB + sideC;
    }

    public double getArea( )
    {
        s = perimeter/2.0;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
}