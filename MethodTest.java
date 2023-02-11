import java.util.Scanner;
public class MethoTry{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        /*System.out.println("Hello there  we are testing a method and apassing parameters to it just for practice");
        System.out.println("We are going to make a calculator where each operation is in a diferent method");
        System.out.println("The program will promt the user to select an operator\nIt then promts for two numers on which the operation will work on");*/

        int num1;
        int num2;
        
        System.out.println("Hello, Welcome to the program,\nPlease enter the operator you wis to use:");
        System.out.println("(+) for addition\n(-)for Subtraction\n(/) for division\n(*) for multiplication");

        String operator=scan.nextString();

        if(operator="+"){
            System.out.println("You have chosen the Addition operator");
            addition(num1,num2);
        }


        public void addition(int x, int y) {
            System.out.printf("The sum of %d and %d is %s",num1, num2, num+num2)
        }
        
    }
    
}
