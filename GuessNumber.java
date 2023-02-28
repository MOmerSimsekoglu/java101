import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();

        int number= rand.nextInt(100);

        Scanner inp= new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You have five right!");
        System.out.println("=========================================");
        int right=0;
        int[] wrong=new int[5];
        boolean isWrong=false;
        boolean isWin=false;

        while(right<5) {
            System.out.print("Please enter a number between 0 and 100:");
            int guess = inp.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("Your number isn't between 0 and 100!!!");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Your right will reduce if you enter more an error number.");
                } else {
                    right++;
                    System.out.println("You enter multiple error number. Your right is:" + (5 - right));
                }
                continue;
            }

            if (guess == number) {
                System.out.println("You are excellant!!");
                System.out.println("You are Winner.");
                System.out.println("Secret number:" + number);
                isWin = true;
                break;
            } else {
                if (guess < number) {
                    System.out.println("Secret number is bigger than your guess number.");

                } else {
                    System.out.println("Secret number is lower than your guess number.");
                }

                wrong[right]=guess;
                right++;
                System.out.println("Your Right:"+(5-right));
            }

        }

            if (!isWin) {

                System.out.println("You are loser!!!!!");
                System.out.println("Secret number is "+number+".");

                if (!isWrong) {
                    System.out.println("Your wrong guess is" + Arrays.toString(wrong));


                }
            }


    }
}