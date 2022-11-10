import java.util.Scanner;
public class Player {
    Scanner input =new Scanner(System.in);
    boolean flag =true;
    int number=0;
    
    public int player()
    {
        while(flag)
        {
            System.out.println("Guess a number between 0 to 10::");
            number=input.nextInt();
            if (number>10)
            {
                System.out.println("you have entered a number greater than 10");
            }
            else if(number<0)
            {
                System.out.println("you have entered a number les than 0");
            }
            else
            {
                flag=false;
                return number;
            }
        }
        return 0;
    }
     
}
