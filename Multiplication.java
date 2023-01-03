import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the mutiplication table program\nEnter the column range");
        int number=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the row length:");
        int multiplier=scan.nextInt();

        for(int i=1; i<=number;i++){
            for(int j=1; j<=multiplier;j++){
                System.out.printf("|%d|\t", i*j);
            }
            System.out.println();
        }   
        scan.close();     
    }
}