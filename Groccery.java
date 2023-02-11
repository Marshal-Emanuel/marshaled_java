import java.util.Scanner;
public class Groccery{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("HEllO, Welcome to the groccery program");
        System.out.println("What store do you wish to tabulate into");
        System.out.println("Nairobi\nMachakos\nMeru");

        GrocceryTemplate nairobi = new GrocceryTemplate();

        System.out.print("\nHow many apples are sold annually?: ");
        nairobi.applesSoldYearly=scan.nextInt();
        
        System.out.print("\nWhat is the retail price of an apple?: ");
        nairobi.appleRetailPrice=scan.nextDouble();

        System.out.print("\nHow many oranges are sold annualy?; ");
        nairobi.orangesSoldYearly=scan.nextInt();

        System.out.print("\nWhat is the retail price of an apple?: ");
        nairobi.orangeRetailPrice=scan.nextDouble();

        System.out.printf("The total amount earned from apples is: " +grandApple(nairobi.applesSoldYearly, nairobi.appleRetailPrice));
        System.out.printf("The total amount earned from oranges is: " +grandApple(nairobi.orangesSoldYearly, nairobi.orangeRetailPrice));



        GrocceryTemplate machakos = new GrocceryTemplate();
        GrocceryTemplate meru = new GrocceryTemplate();
        
                
    }

    public static double grandApple(int a, double b) {
        //System.out.printf("The total amount earned from apples is %.2f%\n", (a * b ));
        return a*b;
        
    }

}

class GrocceryTemplate{
    int applesSoldYearly;
    double appleRetailPrice;

    int orangesSoldYearly;
    double orangeRetailPrice;
}