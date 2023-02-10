import java.util.Scanner;

public class RecursiveDesen {

    static int recursive(int number) {


        if (number >= 0) {
            System.out.println(number + " ");
            return recursive(number - 5);

        }
        return number;

    }

    static int recursive1(int number, int number1) {


        if (number1 >= number) {
            System.out.println(number + " ");
            return recursive1(number + 5, number1);

        }
        return number;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = inp.nextInt();
        int number1 = number;
        recursive1(recursive(number), number1);

    }
}