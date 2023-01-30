import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz:");
        int n= inp.nextInt();

    int a=0; int b=1; int c;
        for (int i=0; i<n; i++){

            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

            }
}