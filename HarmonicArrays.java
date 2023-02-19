import java.util.Scanner;

public class HarmonicArrays {
    public static void main(String[] args) {
        double average = 0.0;
        double sum = 0.0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter number of elements:");
        int a = inp.nextInt();

        int[] list = new int[a];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }

        for (double j : list) {
            sum += (1 / j);
        }

        average = list.length / sum;
        System.out.println("Harmonic average:" + average);
    }
}