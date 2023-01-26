import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int n= inp.nextInt();

        for (int i =0; i<=n; i++){
            for (int k=0; k<i; k++){
                System.out.print(" ");
            }
            for (int l=0; l<=(2*n-2-2*i);l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}