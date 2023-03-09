import java.util.Scanner;
public class assignment1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//input is an object and you can choose your own too
		int num1;//num1 is a variable of interger type you can change it 
		String word1; //this is a varible of string type you can change i
		System.out.print("Enter a number and i will echo it later:");
		num1 =input.nextInt();//reads input from num1
		System.out.print("Enter a word and i will echo it later:");
		word1=input.next();//reads input for word1
		System.out.println("Here is the echo of what you have entered :");//echoing input to num1
		System.out.println("the number you have entered is :"+num1);//echoing input to num1
		System.out.println("the word you have entered is: "+word1);//echoing input to word1

	}

}
