import java.util.Scanner;
public class Demo {

    int rangeStart;
    int rangeEnd;



    static void range(int rangeStart, int rangeEnd){

        for(int i=rangeStart; i<=rangeEnd; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int rangeStart;
        int rangeEnd;
        
        System.out.println("Enter the beggining range:");
        rangeStart=scan.nextInt();

        System.out.println("Enter the ending range:");
        rangeEnd=scan.nextInt();

        System.out.println("The range between "+rangeStart+" and " + rangeEnd+" is:");

        range(rangeStart,rangeEnd);
        scan.close();

        
        }
}

