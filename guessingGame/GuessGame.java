public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    int targetNumber=0;
    
    int guessp1=0;
    int guessp2=0;
    int guessp3=0;
    
    boolean p1isRight=false;
    boolean p2isRight=false;
    boolean p3isRight=false;
    public void startGame()
    {
        p1= new Player();
        System.out.println("hellow player 1 the game has started");
        guessp1=p1.player();
        p2=new Player();
        System.out.println("hellow player 2 the game has started");
        guessp2=p2.player();
        System.out.println("hellow player 3 the game has started");
        p3 =new Player();
        guessp3=p3.player();
       //method call to determin the number the computer choose; 
        targetNumber=computer();
        //method call to print the results
        results();
        //method call to determine the winner 
        determineTheWinner();
    }
    private int computer()
    {
        int number=(int)(Math.random()*10);
        return number;
    }
    protected void determineTheWinner()
    {
        if(targetNumber==guessp1)
        {
            p1isRight=true;
        }
        if(targetNumber==guessp2)
        {
            p2isRight=true;
        }
        if(targetNumber==guessp3)
        {
            p3isRight=true;
        }
        if(p2isRight&&p3isRight&&p2isRight)
        {
            System.out.print("all players won");
        }
        else if(p1isRight||p2isRight||p3isRight)
        {
            if(p1isRight)
            {
                System.out.print("  player 1");
            }
            if(p2isRight)
            {
                System.out.print("  player 2");
            }
            if(p3isRight)
            {
                System.out.print("  player 3");
            }
            
                System.out.println("won!!! ");
           System.out.println("==================================");  
                
        }
        else 
        {
                System.out.println("no winner try again");
                 System.out.println("==================================");
                startGame();
        }
    }
    public void results()
    {
        System.out.println("==================================");
        System.out.println("player one guessed " +guessp1);
        System.out.println("player two guessed " +guessp2);
        System.out.println("player three guessed " +guessp3);
        System.out.println("==================================");
        System.out.println("collect answer is "+targetNumber);
        System.out.println("==================================");
    }
    
}
