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
            System.out.println("     |*You have chosen the addition operator");
            System.out.println("     | Enter the First no. to be added:");

            int num1= scan.nextInt();

            System.out.println("     | Enter the Second no. to be added:");

            int num2=scan.nextInt();

            int sum=num1+num2;

            System.out.printf("     |------The sum of %d and %d is %d -------", num1, num2, sum);
        }
        else if(operator==2){
            System.out.println("     |*You have chosen the Subtraction operator");
            System.out.println("     | Enter the number to be subtracted from:");

            double num1= scan.nextDouble();

            System.out.println("     | Enter the number to subtract:");

            double num2=scan.nextDouble();

            double diff=num1-num2;

            System.out.printf("     |------The difference of %f and %f is %f -------", num1, num2, diff);
        }

        else if(operator==3){
            System.out.println("     |*You have chosen the Multiplication operator operator");
            
            System.out.println("     | Enter the number to be multiplied:");
            double num1=scan.nextDouble();

            System.out.println("     | Enter the second number to multiply:");
            double num2=scan.nextDouble();

            double prod=num1*num2;

            System.out.printf("     |------The product of %f and %f is %f -------", num1, num2, prod);
            
        }

        else if(operator==4){
            System.out.println("     |*You have chosen the modulars operator");
            
            System.out.println("     | Enter the first number:");
            double num1=scan.nextDouble();

            System.out.println("     | Enter the second number to multiply;");
            double num2=scan.nextDouble();

             double mod=num1%num2;

            System.out.printf("     |------The MODULARS of %f with %f is %f -------", num1, num2, mod);
        }

        else if(operator==5){
            System.out.println("     |*You have chosen the Multiplication operator operator");
            
            System.out.println("     | Enter the number to be divided:");
            double num1=scan.nextDouble();

            System.out.println("     | Enter the dividing factor;");
            double num2=scan.nextDouble();

            double div=num1/num2;

            System.out.printf("     |------%f divided by %f is %f -------", num1, num2, div);

        }

        else{
            System.out.println("Wrong operation chosen!. Please try again later! ");

            }

    
    }
}
