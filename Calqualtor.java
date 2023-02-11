import java.util.Scanner;

//Calculator program with use of methods

public class Calqualtor{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Calqulator program:");
        System.out.println("Choose the operation you wish to perform");

        System.out.println("\t.Addition\n\t.Subtraction\n\t.Multiplication\n\t.Division");
        String operator=scan.nextLine();

        System.out.println("Enter the first number to be operated on:");
        int num1=scan.nextInt();

        System.out.println("ENter the second number");
        int num2=scan.nextInt();

        if(operator.equalsIgnoreCase("addition")){
            System.out.println("The sum is: "+ading(num2, num2));

        }
        else if(operator.equalsIgnoreCase("subtraction")){
            System.out.println("The difference is: "+subtract(num1, num2));


        }
        else if(operator.equalsIgnoreCase("multiplication")){
            System.out.println("The division equals: "+multiply(num2, num2));


        }
        else if(operator.equalsIgnoreCase("Division")){
            System.out.println("The product is: "+divider(num2, num2));


        }
        else{
            System.out.println("Invalid operation");
        }
         
    }

    public static int ading(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
    
    public static int divider(int a, int b){
        return a/b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }


    

}


