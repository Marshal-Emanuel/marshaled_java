

import java.util.Scanner;

public class Matrixmul {

public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("hellow please enter the number of the raws");
		int rows =input.nextInt();
		System.out.println("enter number of columns");
		int columns =input.nextInt();
		
		if(columns != rows)
		{
			System.out.println("you have entered the wrong matrix");
			System.out.println("the matrix must be the same for multiplication");
			System.exit(0);
		}
		System.out.println("you have entered "+rows+" by "+columns +" matrix");
		int matrix_A [][]= new int [rows][columns];
		int matrix_B [][] =new int [rows][columns];
		int matrix_C [][] =new int [rows][columns];
		System.out.println("Enter matrix A");
		
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
				System.out.println("row "+(i+1)+" column "+(j+1));
				int value = input.nextInt();
				matrix_A[i][j] = value;
				
			}
			
		}

		System.out.println("Enter matrix B ");
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
				System.out.println("row "+(i+1)+" column "+(j+1));
				int value = input.nextInt();
				matrix_B[i][j] = value;
				
			}
			
		}
		int s=0;
		for(int y=0;y<rows;y++)
		{
			for(int j=0;j<columns;j++)
			{
				int value3 =0;
				for(int z=0;z<rows;z++)
					{
						int value1=matrix_A[y][z];				
						int value2=matrix_B[z][j];
						value3 +=(value1*value2);
					}
				matrix_C[y][s]=value3;
				System.out.println(matrix_C[y][s]);
				s++;
			}
			
			s=0;
			
		}
		
		System.out.println("matrix A");
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
				System.out.print(matrix_A[i][j] +"\t");
				
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		System.out.println("matrix B");
		
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
				System.out.print(matrix_B[i][j] +"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n");
		System.out.println("ANSWER");
		
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
				System.out.print(matrix_C[i][j] +"\t");
				
			}
			System.out.println();
		}
		
		

	}


}
