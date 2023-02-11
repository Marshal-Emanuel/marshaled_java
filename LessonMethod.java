import java.util.Scanner;
public class LessonMethod{
    public static int squareArea(int a){
        int area=a*a;
        return area;
    }

    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the length of the square :");
        int length=scan.nextInt();

        int answer=squareArea(length);
        System.out.println("The area of the square is: "+answer);


    }
}