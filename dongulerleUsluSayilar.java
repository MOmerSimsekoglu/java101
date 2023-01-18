
import java.util.*;

public class dongulerleUsluSayilar {
   public static void main (String[] args) {
       Scanner inp=new Scanner(System.in);
       System.out.print("Lütfen üssünü almak istediğiniz sayıyı giriniz:");
       int number=inp.nextInt();
       System.out.print("Lütfen sayının üssünü giriniz:");
       int power=inp.nextInt();
       int numberPower=1;
       for (int i=1; i<=power;i++){

           numberPower *=number;
       }
       System.out.println(number+" sayısının "+power+"'nıncı üssü:"+numberPower);
   }
}
