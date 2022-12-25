import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("     _________________________________________________________");
        System.out.println("     |*******************************************************|");
        System.out.println("     | Hello!, Welcome to your friendly calculator           |");
        System.out.println("     | I can calculate (+)(-)(x)(%) and division operations  |");
        System.out.println("     | ENTER:                                                |");
        System.out.println("     | 1 to add(+)                                           |");
        System.out.println("     | 2 to subtract(-)                                      |");
        System.out.println("     | 3 to multilpy(x)                                      |");
        System.out.println("     | 4 to find modulars(%)                                 |");
        System.out.println("     | 5 to divide                                           |");
        System.out.println("     |_______________________________________________________|");

        int operator= scan.nextInt();
        
        if(operator==1){
            System.out.println("|*You have chosen the addition operator");
            System.out.println("| Enter the First no. to be added:");

            int num1= scan.nextInt();

            System.out.println("| Enter the Second no. to be added:");

            int num2=scan.nextInt();

            int sum=num1+num2;

            System.out.printf("------The sum of %d and %d is %d -------", num1, num2, sum);
        }


        



    }
}
