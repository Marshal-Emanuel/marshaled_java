import java.util.Scanner;
public class Weather {
    
    public static void spring(){
        System.out.println("The weather is spring and the fowers are blooming");
    }

    public static void summer(){
        System.out.println("The weather is summer and the grass is drying up");
    }

    public static void winter(){
        System.out.println("The weather is winter and the snow is falling");
    }

    public static void autumn(){
        System.out.println("The weather is autumn and the winds are blowing");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the weather?\n\t1.Spring\n\t2.Summer\n\t3.Winter\n\t4.Autumn");
        String weather=scan.nextLine();

        if(weather.equalsIgnoreCase("spring")){
            spring();
        }
        else if(weather.equalsIgnoreCase("summer")){
            summer();
        }
        else if(weather.equalsIgnoreCase("winter")){
            winter();
        }
        else{
            autumn();
        }
        
    }
}
