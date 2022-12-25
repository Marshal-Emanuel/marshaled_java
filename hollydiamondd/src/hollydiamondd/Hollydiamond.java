package hollydiamondd;

import java.util.*;

public class Hollydiamond {

	public static void main(String[] args) {
		@SuppressWarnings("resource")//out generation
		Scanner scanner =new Scanner(System.in);
		int i,j,k;
		boolean faith =true;
		System.out.println("Hellow::please enter the number of columns");
		j=scanner.nextInt();
		i=j*2;//to double the number of the  column
		int g=0;//to initialize the value of g to 0
		int v=j;//to make a copy the value of v;
		for(k=0;k<=i;k++)//this is the loop that counts the number if the column
		{
			for(int y=0;y<v;y++)//this is the loop that prints what happens to every row
			{
				System.out.print(" ");//this statement prints out the first empty lines
			}
			System.out.print("*");//this prints out the first star in every statement
			for (int y=1;y<=g;y++)//this is responsible the counts after first star
			{
				System.out.print("*");//this helps to print a stars after first star
			}
			
			
			if (faith)//this is a boolean condition used to see if the loop will enter the in
			{
				v--;//is used to decrement the value of v
				g=g+2;//is used to increase the value of g by 2
				if(v==0)//to check if the value is 0 to change the direction
				{
					faith=false;//to turn the value of change to false
				}
			}
			else//if the value of change is false
			{
				v++;//start incrementing
				g=g-2;//while this decrements
			}
			System.out.println();//to show its time to move to next line
		}
		

	}

}
