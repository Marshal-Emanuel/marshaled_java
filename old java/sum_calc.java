import java.util.Scanner; 
class AddDigitsOfANumberClass{ 
	public static void main(String[] args){
		/* sum variable store sum of digits */

		/* last_digit variable contain last digits
		of a number until loop termination */    
		int sum = 0,last_digit; 


		Scanner sc = new Scanner(System.in);

		/* Display message for number input */
		System.out.println("Enter any number");

		/* Number input from user */
		int number = sc.nextInt();

		/* loop continue number remain 0 */
		while(number>0){

			/* get last digit of a number */
			last_digit = number%10;

			/* add last digit to the sum */
			sum = sum+last_digit;

			/* truncate last digit from number */
			number = number/10;
		}

		/* After loop completion results will display */
		System.out.println("Sum of digits are : " + sum);
	}
