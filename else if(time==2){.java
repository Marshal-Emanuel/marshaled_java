else if(time==2){
            System.out.println("|_________________________________________________________________\n|");
            System.out.println("|--------  You have selected the Lunch menu  ----------");
            System.out.println("|       The following meals are available for Lunch today!:)");
            //System.out.println("|                 Drinks:");
            System.out.print("|-->1:Rice and Beef stew(with greens)~~~~60$\n|\n|---->2:French Fries and Chicken(1/4)~~~~70$\n|\n|------>3:CHpati and Cereals<beans, cowpeas>(with veggies)~~~~60$\n|\n|-------->4:Ugali and Fried fish(Tilapia)~~~~90$\n|\n|\n|");
            scan.nextLine();
            int food=scan.nextInt();


             System.out.println("|_________________________________________________________________\n|");
                System.out.println("|You have selected Rice and Beef stew(with greens)\n|\n| Please enter the number of plates as we prepare the delight :)");
                int plates=scan.nextInt();
                System.out.printf("|%d plate(s) will be served in a short time\n|\n| Would you like to have a drink with the meal? Yes/No\n", plates);

                scan.nextLine();
                String decide=scan.nextLine();

                /*if(decide.equalsIgnoreCase("yes")){
                    System.out.println("|_________________________________________________________________\n|");
                    System.out.println("|The folowing drinks are in available today. Please select the desired drink :)");
                    System.out.println("|1.Cocktail ~~~~~~~~25$\n|2.Mango Juice~~~~~~~~~~~~~20$\n|3.Mixed fruit Juice~~~~~~~~~~~~~~~~~~25$");

                    int drink=scan.nextInt();

                    if(drink==1){
                        System.out.println("|_________________________________________________________________");
                        System.out.println("|You have chosen Cocktail for your drink \n|How many glasses should we serve?");

                        int glasses=scan.nextInt();

                        System.out.println("|Thank you for eating with us :)! Relax as we prepare the meal.\n|");
                        
                        
                        int bills=plates*60+glasses*25;
                       System.out.printf("|Your bill is as follows:\n| %d$ for your food \n|%d$ for the drink\n|~~which sum up as %d $\n|\n|We hope you enjoy your meal:) Come one ,come all! :) \n|          ~`Billie Hotel`~\n", plates*25, glasses*15, bills);
        }*/
























        /*  Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the mutiplication table program\nEnter the column range");
        int number=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the row length:");
        int multiplier=scan.nextInt();

        for(int i=1; i<=number;i++){
            for(int j=1; j<=multiplier;j++){
                System.out.printf("|%d|\t", i*j);
            }
            System.out.println();
        }   
        scan.close();     
    }*/