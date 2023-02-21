import java.util.Arrays;

public class EvenNumber {
    public static void main(String[] args) {

        int[] list = {2, 2, 5, 9, 6, 6, 9, 15, 13, 13, 34, 56, 96, 55, 96};
        int[] duplicate = new int[list.length];

        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] % 2 == 0 && list[j] % 2 == 0) && (list[i] == list[j])) {
                    duplicate[startIndex] = list[i];
                    startIndex++;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}