import java.util.Scanner;
public class Calc{
    public static void main(String[] args){
        //this is an alternative calculator with a diferent user interactivity interface
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome user");
        System.out.println("The calculator can perform the following operations:");
        System.out.println("(+) (-) (x) (%) and DIVISION");

        System.out.println("Enter the desired operator to continue :)");
        char operator= scan.nextChar();   
        
    }
}