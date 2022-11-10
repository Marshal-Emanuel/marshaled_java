public class switchcase {

	public static void main(String[] args) {
		/*syntax of switch is expressed as 
		 * switch (expression ){
		 * case value1:
		 *   statement
		 *   break;
		 *   case value2:
		 *   statement
		 *   break;
		 *   
		 *   ....
		 *   default:
		 *   statement
		 *   break;
		 *   }
		 *   here the expression is of types int ,short ,byte or char .
		 *   values should be constants literal values and can not be dublicated 
		 *   
		 *   flow of switch statement is as below 
		 *   expression value is compared with each case value .if it matches ,statement following the case will be executed
		 *   break statement is used to terminate the execution of statements
		 *   if none of the case matches ,statements following the default would be executed.
		 * if breakes statement is not used within case ,all cases following 
		 * matching cases would be executed.
		 */
		for(int i=0;i<=3;i++)
		{
			switch (i)
			{
				case 0:
					System.out.println("i is 0");
					break;
				case 1:
					System.out.println("i is 1");
					break;
				case 2:
					System.out.println("i is 2");
					break;
				default:
					System.out.println("i is greater than 2");
					
			}
		}
	}

}
