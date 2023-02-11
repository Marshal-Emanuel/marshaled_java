import java.util.Scanner;
public class MethodTry{
    int num1;
    int num2;
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        /*System.out.println("Hello there  we are testing a method and apassing parameters to it just for practice");
        System.out.println("We are going to make a calculator where each operation is in a diferent method");
        System.out.println("The program will promt the user to select an operator\nIt then promts for two numers on which the operation will work on");*/
        //MethodTry try=new MethodTry();
         
        
        System.out.println("Hello, Welcome to the program,\nPlease enter the operator you wis to use:");
        System.out.println("(+) for addition\n(-)for Subtraction\n(/) for division\n(*) for multiplication");

        String operator=scan.nextLine();

        if(operator=="+"){
            System.out.println("You have chosen the Addition operator");
            /*try.*/adition(int, int);
        }
            
    }
    public static void adition(int num1, int num2) {
        int sum=num1+num2;
        System.out.printf("The sum of %d and %d is %d",num1, num2,sum);
    }
    
}
