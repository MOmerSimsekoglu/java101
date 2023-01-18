import java.util.Scanner;

public class dongulerCiftDort {
    public static void main (String[] args){

        Scanner inp= new Scanner(System.in);
        int sum=0;
        int number;
        do {
            System.out.print("Lütfen bir sayi giriniz:");
            number= inp.nextInt();
            if (number%2==0 && number%4==0){
                sum +=number;
            }
        }while(number%2==0);
        System.out.println("Girilen sayılardan çift ve dördün katı olan sayıların toplamı:"+sum);
    }
}
