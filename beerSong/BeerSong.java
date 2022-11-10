package beerSong;

public class BeerSong {
/*
 * @param args the command line arguments
 */
	public static void main(String[] args) {
		int beerNum=99;
		String word ="Bottles";
		while(beerNum>0)
		{
			
			System.out.println(beerNum+" "+word +" of beer on the wall");
			System.out.println(beerNum+" "+word+" of beer");
			System.out.println("take one down");
			System.out.println("pass it around");
			
			
			beerNum=beerNum-1;
			if(beerNum==1) {
				word ="Bottle";
			}
			if(beerNum>0)
			{
				System.out.println(beerNum+" "+word +" of beer on the wall");
			}
			else
			{
				System.out.println("no more bottles of beer on the wall!!");
			}
		}
		//TODO code application logic here

	}

}
