package soliddiamond;

import java.util.Scanner;

public class Soliddiamond {

	public static void main(String[] args) {
   // @suppresswarnings("resource")//out generation
   Scanner scanner=new Scanner(System.in);
    int i,j,k;
   boolean faith=true;
   System.out.println("enter the number of columns");
   j=scanner.nextInt();
   i=j*2;
   //to double the number of columns
   int g=0;//initialize g
   for(k=0;k<=i;k++)//this loop counts the number in the columns
   {
	   for(int y=0;y<j;y++)//prints what happens to every row
	   {
		   System.out.print(" ");//this prints the first empty lines
	   }
	   
	   System.out.print("*");//prints the star
	   for(int y=1;y<=g;y++)//responsible for the counts of the stars
	   {
		   System.out.print(" ");
		   if(y==g)//prints the last star
		   {
	   System.out.print( "*");//helps to print stars after first star
	   }
	   }
	   if (faith)//to see if the loop will enter the in
	   {
		   j--;//to decrement the value of v
		   g=g+2;//increase value of g by 2
		   if(j==0)//check if the value is 0 to change the direction
		   {
			   faith=false;//to change to false
		   }
	   }
	   else
	   {
		   j++;//starts incrementing
		   g=g-2;//while this decrements
	   }
	   System.out.println();//to move to nextline
   }

	}
  }
