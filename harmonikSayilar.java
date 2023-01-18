import java.util.*;
public class harmonikSayilar {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz:");
        int number=inp.nextInt();
        double harmonic=0;

        for (double i=1; i<=number;i++){
            harmonic +=(1/i);
        }
        System.out.println(number+" sayısının harmonik serisi toplamı:"+harmonic);
    }
}