import java.util.*;

public class dongulerleBasamakSayilari {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        int number=inp.nextInt();
        int tempNumber=number ,basNumber=0, sum=0;

        while(tempNumber!=0){

            basNumber=tempNumber%10;
            sum += basNumber;
            tempNumber /=10;
        }
        System.out.println(number+" sayısının basamak değerleri toplamı:"+sum);
    }
}
