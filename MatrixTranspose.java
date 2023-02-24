import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter number of row:");
        int n1 = inp.nextInt();
        System.out.print("Please enter number of column:");
        int n2 = inp.nextInt();

        int[][] list = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Please enter List[" + i + "]" + "[" + j + "]:");
                list[i][j] = inp.nextInt();
            }
        }
        System.out.println("=========================");
        System.out.println("list[" + n1 + "][" + n2 + "]:");

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
        System.out.println("list1[" + n2 + "][" + n1 + "]:");

        int[][] list1 = new int[n2][n1];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                list1[i][j] = list[j][i];
                System.out.print(list1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }
}
