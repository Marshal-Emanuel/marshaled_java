import java.util.*;
    
public class Soliddiamond {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		int i,j,k;
		boolean faith =true;
		System.out.println("Hellow::please enter the number of columns");
		j=scanner.nextInt();
		i=j*2;
		int g=0;
		int v=j;
		for(k=0;k<=i;k++)
				{
			for(int y=0;y<v;y++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for (int y=1;y<=g;y++)
			{
				System.out.print("*");
			}
			
			
			if (faith)
			{
				v--;
				g=g+2;
				if(v==0)
				{
					faith=false;
				}
			}
			else
			{
				v++;
				g=g-2;
			}
			System.out.println();
		}
		

	}

}



