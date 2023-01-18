import java.util.*;
public class donguler4ve5inKatlari {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int number = inp.nextInt();
        int i;
        for (i = 1; i <= number; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
