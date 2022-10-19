//Java program to find Area of Triangle.

import java.util.*;

public class AreaTriangle{

    public static void main(String []args){
        double base,height,area;

        Scanner sc=new Scanner(System.in);

        //Read Length and Width of Triangle
        System.out.print("Enter Base Widht: ");
        base=sc.nextDouble();
        System.out.print("Enter Height: ");
        height=sc.nextDouble();

        //Calculate Area
        area = (base*height)/2;

        //Print Result
        System.out.println("Area of Triangle: " + area);

    }
}