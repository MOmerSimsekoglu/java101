import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter number of index:");
        int n = inp.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Please enter List[" + i + "]:");
            list[i] = inp.nextInt();
        }

        System.out.println("===============================");
        System.out.println("list[]=" + Arrays.toString(list));
        System.out.println("===============================");
        boolean[] control = new boolean[n];
        for (int k = 0; k < n; k++) {

            if (control[k]) {
                continue;

            }
            int count = 0;

            for (int l = 0; l < n; l++) {
                if (list[k] == list[l]) {
                    count += 1;
                    control[l] = true;
                }

            }

            System.out.println(list[k] + " number duplicate " + count + " times.");
        }
    }
}