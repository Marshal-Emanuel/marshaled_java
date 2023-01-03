import java.util.Scanner;
public class Calc{
    public static void main(String[] args){
        //this is an alternative calculator with a diferent user interactivity interface
        
        System.out.println("welcome user");
        System.out.println("The calculator can perform the following operations:");
        System.out.println("(+) (-) (x) (%) and DIVISION");

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first number:");
        double numb1=scan.nextInt();
 
        System.out.println("Enter the second number:");
        double numb2=scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the desired operator i.e [(+), (-), (x), (%) or (/)~to divide] to continue :)");
        String operator=scan.nextLine();

        if(operator.equals("+")){
            System.out.printf("%f + %f = %f", numb1, numb2, numb1+numb2);
        }
        else if(operator.equals("-")){
            System.out.printf("%f - %f =%f", numb1, numb2, numb1-numb2);
        }
        else if(operator.equals("x")){
            System.out.printf("%f x %f =%f", numb1, numb2, numb1*numb2);
        }
        else if(operator.equals("%")){
            System.out.printf("%f % %f =%f", numb1, numb2, numb1%numb2);
        }
        else if(operator.equals("/")){
            System.out.printf("%f / %f =%f", numb1, numb2, numb1/numb2);
        }
        else{
            System.out.println("You have entered the wrong operator! Try again");
        }

        scan.close();
    }
}