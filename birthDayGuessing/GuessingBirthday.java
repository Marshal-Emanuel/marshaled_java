package birthDayGuessing;

import java.util.Scanner;

public class GuessingBirthday {
    
    public static void main(String[] args) {
        String set1=
                """
                1 3 5 7
                9 11 13 15
                17 19 21 23
                25 27 29 31
                """;
        String set2=
                """
                2 3 6 7
                10 11 14 15
                18 19 22 23
                26 27 30 31
                """;
        String set3=
                """
                4 5 6 7
                12 13 14 15
                20 21 22 23
                28 29 30 31
                """;
        String set4=
                """
                8 9 10 11 
                12 13 14 15
                24 25 26 27
                28 29 30 31
                """;
        String set5=
                """
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31
                """;
        int day=0;
        
        Scanner input =new Scanner (System.in);
        System.out.println(set1);
        print();
        int answer= input.nextInt();
        if(answer ==1)
            day+=1;
        
        System.out.println(set2);
       print();
        answer= input.nextInt();
        if(answer ==1)
            day+=2;
        
        System.out.println(set3);
       print();
        answer= input.nextInt();
        if(answer ==1)
            day+=4;
        
        System.out.println(set4);
        print();
        answer= input.nextInt();
        if(answer ==1)
            day+=8;
        
        System.out.println(set5);
        print();
        answer= input.nextInt();
        if(answer ==1)
            day+=16;
        
        
        System.out.println("==================================");
        System.out.println("you where born on "+day);
        System.out.println("==================================");
    }
    static void print()
    {
        System.out.println("does your name appear in the above set");
        System.out.print("select 1 for yes and 0 for no?");
    }
    
}
