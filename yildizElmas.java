import java.util.Scanner;

public class yildizElmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = inp.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a = 0; a <= n ; a++) {

            for (int b = 0; b<=(a) ; b++) {
                System.out.print(" ");
            }

            for (int c = 0; c <= (2*n-2-2*a); c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}