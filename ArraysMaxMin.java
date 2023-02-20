import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxMin {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter number of elements:");
        int n=inp.nextInt();
        int[] list=new int[n];
        for (int k=0; k< list.length;k++){
            System.out.print("Please enter "+k+". elements:");
            list[k]= inp.nextInt();
        }
        System.out.println("====================");
        System.out.println(Arrays.toString(list));
        System.out.println("====================");
        System.out.print("Please enter a number:");
        int number = inp.nextInt();

        Arrays.sort(list);
        int min = list[0];
        int max = list[0];

        for (int i : list) {

            if (i < number) {
                if (i > min) {
                    min = i;
                }
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Largest number less than " + number + " : " + min);
        System.out.println("Smallest number greater than  " + number + " : " + max);
    }
}
