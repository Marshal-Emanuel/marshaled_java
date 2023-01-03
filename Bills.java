//A hotel program that gets the bill of a customer
import java.util.Scanner;
public class Bills{
    public static void main(String [] args){
        System.out.println("\n _________________________________________________________________\n|");
        System.out.println("|                        ****Welcome to****                       |");
        System.out.println("|                         ~`Billie Hotel`~                        |");
        System.out.println("|             We have a variety of Dishes today:)                 |");
        System.out.println("|         Select the course you wish from the menu below          |\n|");
        System.out.printf("|-->1:Breakfast\n|---->2:Lunch\n|------>3:Supper\n|");
        
        Scanner scan=new Scanner(System.in);
        int time=scan.nextInt();

        //Breafast
        if(time==1){
            System.out.println("|_________________________________________________________________\n|");
            System.out.println("|--------  You have selected the breakfast menu  ----------");
            System.out.println("|       The following meals are available for breakfast today!:)");
            System.out.println("|                 Drinks:");
            System.out.print("|-->1:Tea(with milk)~~~~10$\n|\n|---->2:American tea~~~~8$\n|\n|------>3:Coffee(with milk)~~~~15$\n|\n|-------->4:Black coffee~~~~10$\n|\n|\n|");
            scan.nextLine();
            int drink=scan.nextInt();
            //Milked tea
            if(drink==1){
                System.out.println("|_________________________________________________________________\n|");
                System.out.println("|You have selected milked tea\n|\n| Please enter the number of cups as we prepare the delight :)");
                int cups=scan.nextInt();
                System.out.printf("|%d cup(s) will be served in a short time\n|\n| Would you like to have an escort with the tea? Yes/No\n", cups);

                scan.nextLine();
                String decide=scan.nextLine();

                if(decide.equalsIgnoreCase("yes")){
                    System.out.println("|_________________________________________________________________\n|");
                    System.out.println("|The folowing snacs are in shelve today. Please select the desired escort :)");
                    System.out.println("|1.Bread(Butter,peanut,margrine,jam) ~~~~~~~~15$\n|2.Cake(Chocolate, Vanilla)~~~~~~~~~~~~~20$\n|3.Mahamri~~~~~~~~~~~~~~~~~~10$");

                    int snac=scan.nextInt();

                    if(snac==1){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Bread for your snac\n|How many pieces should we serve?");

                        int breads=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=breads*15+cups*10;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*10, breads*15, bills);
                    }
                    else if(snac==2){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Cake for your snac\n|How many pieces should we serve?");

                        int cakes=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=cakes*20+cups*10;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*10, cakes*20, bills);
                    }
                    else if(snac==3){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Mahamri for your snac\n|How many pieces should we serve?");

                        int mahamri=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=mahamri*10+cups*10;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*10, mahamri*10, bills);
                    }
                }
                else{
                    System.out.printf("\n|Noted!\n|Your bill is as follows:\n| %d$ for your tea \n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*10);
                    System.out.println("|_________________________________________________________________");
                
                }
                
            }
            //American Tea
            else if(drink==2){
                System.out.println("|_________________________________________________________________\n|");
                System.out.println("|You have selected American tea\n|\n| Please enter the number of cups as we prepare the delight :)");
                int cups=scan.nextInt();
                System.out.printf("|%d cup(s) will be served in a short time\n|\n| Would you like to have an escort with the tea? Yes/No\n", cups);

                scan.nextLine();
                String decide=scan.nextLine();

                if(decide.equalsIgnoreCase("yes")){
                    System.out.println("|_________________________________________________________________\n|");
                    System.out.println("|The folowing snacs are in shelve today. Please select the desired escort :)");
                    System.out.println("|1.Bread(Butter,peanut,margrine,jam) ~~~~~~~~15$\n|2.Cake(Chocolate, Vanilla)~~~~~~~~~~~~~20$\n|3.Mahamri~~~~~~~~~~~~~~~~~~10$");

                    int snac=scan.nextInt();

                    if(snac==1){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Bread for your snac\n|How many pieces should we serve?");

                        int breads=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=breads*15+cups*8;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your American tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*8, breads*15, bills);
                    }
                    else if(snac==2){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Cake for your snac\n|How many pieces should we serve?");

                        int cakes=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=cakes*20+cups*8;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*8, cakes*20, bills);
                    }
                    else if(snac==3){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Mahamri for your snac\n|How many pieces should we serve?");

                        int mahamri=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=mahamri*10+cups*8;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*8, mahamri*10, bills);
                    }
                }
                else{
                    System.out.printf("\n|Noted!\n|Your bill is as follows:\n| %d$ for your tea \n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*8);
                    System.out.println("|_________________________________________________________________");
                
                }
                
            }
            //Coffe with milk
            else if(drink==3){
                System.out.println("|_________________________________________________________________\n|");
                System.out.println("|You have selected milked Coffee\n|\n| Please enter the number of cups as we prepare the delight :)");
                int cups=scan.nextInt();
                System.out.printf("|%d cup(s) will be served in a short time\n|\n| Would you like to have an escort with the coffee? Yes/No\n", cups);

                scan.nextLine();
                String decide=scan.nextLine();

                if(decide.equalsIgnoreCase("yes")){
                    System.out.println("|_________________________________________________________________\n|");
                    System.out.println("|The folowing snacs are in shelve today. Please select the desired escort :)");
                    System.out.println("|1.Bread(Butter,peanut,margrine,jam) ~~~~~~~~15$\n|2.Cake(Chocolate, Vanilla)~~~~~~~~~~~~~20$\n|3.Mahamri~~~~~~~~~~~~~~~~~~10$");

                    int snac=scan.nextInt();

                    if(snac==1){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Bread for your snac\n|How many pieces should we serve?");

                        int breads=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=breads*15+cups*15;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*15, breads*15, bills);
                    }
                    else if(snac==2){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Cake for your snac\n|How many pieces should we serve?");

                        int cakes=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=cakes*20+cups*15;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*15, cakes*20, bills);
                    }
                    else if(snac==3){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Mahamri for your snac\n|How many pieces should we serve?");

                        int mahamri=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=mahamri*10+cups*15;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your tea \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*15, mahamri*10, bills);
                    }
                }
                else{
                    System.out.printf("\n|Noted!\n|Your bill is as follows:\n| %d$ for your tea \n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*15);
                    System.out.println("|_________________________________________________________________");
                
                }
                
            }
            //Blak coffee
            else if(drink==4){
                System.out.println("|_________________________________________________________________\n|");
                System.out.println("|You have selected Black Coffee\n|\n| Please enter the number of cups as we prepare the delight :)");
                int cups=scan.nextInt();
                System.out.printf("|%d cup(s) will be served in a short time\n|\n| Would you like to have an escort with the coffee? Yes/No\n", cups);

                scan.nextLine();
                String decide=scan.nextLine();

                if(decide.equalsIgnoreCase("yes")){
                    System.out.println("|_________________________________________________________________\n|");
                    System.out.println("|The folowing snacs are in shelve today. Please select the desired escort :)");
                    System.out.println("|1.Bread(Butter,peanut,margrine,jam) ~~~~~~~~15$\n|2.Cake(Chocolate, Vanilla)~~~~~~~~~~~~~20$\n|3.Mahamri~~~~~~~~~~~~~~~~~~10$");

                    int snac=scan.nextInt();

                    if(snac==1){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Bread for your snac\n|How many pieces should we serve?");

                        int breads=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=breads*15+cups*10;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your coffee \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*10, breads*15, bills);
                    }
                    else if(snac==2){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Cake for your snac\n|How many pieces should we serve?");

                        int cakes=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=cakes*20+cups*10;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your coffee \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", cups*10, cakes*20, bills);
                    }
                    else if(snac==3){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Mahamri for your snac\n|How many pieces should we serve?");

                        int mahamri=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=mahamri*10+cups*10;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your coffee \n|%d$ for the snack\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*10, mahamri*10, bills);
                    }
                }
                else{
                    System.out.printf("\n|Noted!\n|Your bill is as follows:\n| %d$ for your coffee \n|\n|We hope you enjoy your meal:) Come one ,come all! :)\n|          ~`Billie Hotel`~\n", cups*10);
                    System.out.println("|_________________________________________________________________");
                
                }
                
            }
            else{System.out.println("Invalid Entry, Please try again!");}
        }
        else if(time==2){
            System.out.println("|_________________________________________________________________\n|");
            System.out.println("|--------  You have selected the Lunch menu  ----------");
            System.out.println("|       The following meals are available for Lunch today!:)");

            System.out.print("|-->1:Rice and Beef stew(with greens)~~~~60$\n|\n|---->2:French Fries and Chicken(1/4)~~~~70$\n|\n|------>3:CHpati and Cereals<beans, cowpeas>(with veggies)~~~~60$\n|\n|-------->4:Ugali and Fried fish(Tilapia)~~~~90$\n|\n|\n|");
            scan.nextLine();
            int food=scan.nextInt();
            
            if(food==1){
                System.out.println("|_________________________________________________________________\n|");
                System.out.println("|You have selected Rice and Beef stew(with greens)\n|\n| Please enter the number of plates as we prepare the delight :)");
                int plates=scan.nextInt();
                System.out.printf("|%d plate(s) will be served in a short time\n|\n| Would you like to have a drink with the meal? Yes/No\n", plates);

                scan.nextLine();
        }
        
        else{System.out.println("|\n|Invalid entry, please try again!\n");}
        }
            
}           
          
