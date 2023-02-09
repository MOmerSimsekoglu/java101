import java.util.Scanner;

public class PrimeNumberRecursive {

    static boolean primeNumber(int a, int b) {
        if (b >= a) {
            return true;
        }

        if (a % b == 0) {
            return false;
        } else {
            return primeNumber(a, b + 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = inp.nextInt();
        int b = 2;

        if (primeNumber(a, b)) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " isn't a prime number.");
        }
    }
}
