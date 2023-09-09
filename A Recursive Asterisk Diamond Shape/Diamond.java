package asterisk; aestericks     
import java.util.Scanner;       
public class Diamond {  

	public static void main(String[] args) {
		 
				Scanner input =new Scanner (System.in);
				int num1;
				System.out.println("Please enter the number  to find the reculsive:");
				num1=input.nextInt();
				System.out.println(Diamond_Asterisk(num1));
				System.out.println(Diamond_Asterisk2(num1));
				System.out.println(Space(num1));
    
			}
			public static String Diamond_Asterisk(int num)//method1
			{
				if (num>0)
				{
					return "*_"+Diamond_Asterisk(num-1);
				}
				else
				{
					return "-";
				}
			}
			private static String Diamond_Asterisk2(int num)//method2
			{
				if(num>0)
				{
					return "*_"+Diamond_Asterisk(num-1);
				}
				else
				{
					return "-";
				}
			}
			private static String Space(int num)//method3
			{
				if (num>0)
				{
					return "*_"+Space(num-1);
				}
				else
				{
					return "-";
				}
			}

}
