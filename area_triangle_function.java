//Java program to find Area of Triangle.

import java.util.*;

public class AreaTriangle{

    //Function to find Area of Trianle
    public static double AreaOfTriangle(double b, double h)
    {
        double area;
        area= (b*h)/2;
        return area;
    }

    public static void main(String []args){
        double base,height,area;

        Scanner sc=new Scanner(System.in);

        //Read Length and Width of Triangle
        System.out.print("Enter Base Widht: ");
        base=sc.nextDouble();
        System.out.print("Enter Height: ");
        height=sc.nextDouble();

        //Find Area - Calling Functionn
        area= AreaOfTriangle(base, height);

        //Print Result
        System.out.println("Area of Triangle: " + area);

    }
}