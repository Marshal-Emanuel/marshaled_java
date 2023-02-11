/*
 * Sophia Wanguui-
 * Earljoe Kadima
 * Emanuel Marshal-
 * Vincent Mutua
 * Benjamin Moses
 * Tracy Aranga 
 * Dismas Njoroge
 * Violet Akoth
 * Patrick Mwanzia
 * Nigel Kipkirui
 * 
 */
import java.util.Scanner;
import java.util.Arrays;
class ElementsProgram {
    public static int[] getEvenNumbers(int x, int y) {
        int[] evenNumbers = new int[7];
        int count = 0;

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                count++;
            }
            if (count == 7) {
                break;
            }
        }
        return evenNumbers;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double getAverage(int[] array) {
        int sum = getSum(array);
        return (double) sum / array.length;
    }

    public static int getLargest(int[] array) {
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int getSmallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}

public class ElementsProgramDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range start: ");
        int x = sc.nextInt();
        System.out.println("Enter the range end: ");
        int y = sc.nextInt();

        int[] evenNumbers = ElementsProgram.getEvenNumbers(x, y);
        int sum = ElementsProgram.getSum(evenNumbers);
        double average = ElementsProgram.getAverage(evenNumbers);

        System.out.println("The 1st 7 even numbers in the range are: " + Arrays.toString(evenNumbers));
        System.out.println("Sum of first seven even numbers: : " + sum);
        System.out.println("Average of first seven even numbers:" + average);

        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }

        sum = ElementsProgram.getSum(array);
        average = ElementsProgram.getAverage(array);
        int largest = ElementsProgram.getLargest(array);
        int smallest = ElementsProgram.getSmallest(array);

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        System.out.println("Largest element in array: " + largest);
        System.out.println("Smallest element in array: " + smallest);
    }
}