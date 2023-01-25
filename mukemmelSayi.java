import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz:");
        int inpCount= inp.nextInt();
        int i=1;

        while (i<=inpCount){
            System.out.print("Lütfen bir sayı giriniz:");
            int number= inp.nextInt();
            int sum=0;
            for (int k=1; k<number; k++){

                if (number%k==0){
                    sum +=k;
                }
            }
            if (sum==number){
                System.out.println(number+" Mükemmel sayıdır.");
            }else {
                System.out.println(number+"Mükemmel sayı değildir.");
            }
            i++;
        }
    }
}