
import java.util.Arrays;
import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.print("Please enter number of index:");
        int n=inp.nextInt();
        int[] list= new int[n];

        for (int i=0; i<n;i++){
            System.out.print("Please enter List["+i+"]:");
            list[i]= inp.nextInt();
        }
        System.out.println("===============================");
        System.out.println("list[]="+Arrays.toString(list));
        System.out.println("===============================");

        Arrays.sort(list);
        System.out.println("list1[]="+Arrays.toString(list));
    }
}