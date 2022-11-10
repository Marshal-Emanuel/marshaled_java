public class DetermineLeapYearExample {
	
	public static void main(String[]args)
	{
		//year we what to check
		int year =2004;
		//if year is divisible by 4,is a leap year
		//if ((year%400==0)||((year%4==0)&&(year%100==0)))
		if((year%4==0))
		{
			System.out.println("year"+year+"is a leap year");
		}
		else
		{
			System.out.println("year"+year+"is not a leap year");
		}
	}


}
