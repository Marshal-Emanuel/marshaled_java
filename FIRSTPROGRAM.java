import java.util.Scanner; //to be able to use scanner
			  //predefined function for input
public class Main{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in); //input is an object and you 
						      //can choose your own too.
		int num1; //num1 is a variable of intege type an dyou can change it 
		String word1; //word1 is a variable of tring type and you can change it 
	        System.out.println("Enter a number and i will echo it later: ");
		
		num1=input.nextInt(); //read input for num1
		Sytem.out.println("Enter a word and I will echo it later: ");
		word1=input.next(); //read input for word1
		System.out.println("Here is the echo of what you have entered:");
		System.out.println("The number you have entered is: " + num1); //echoing input to num1
		System.out.println("The word you have entered is: " + word1);  //echoing input to word1
	     }
}
									       
