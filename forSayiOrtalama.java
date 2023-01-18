import java.util.*;
public class forSayiOrtalama {
    public static void main (String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("Aşağıda gireceğiniz sayının 0'dan sayiya kadar olan tüm sayıların\n"
                + "3 ve 4'e tam bölünen sayıların toplamının ortalaması alınacaktır!");
        System.out.print("Lütfen Bir Sayi Giriniz:");
        int sayi= inp.nextInt();
        double ortalama=0;
        int sayiAdet=0, toplam=0;

        for (int i =1; i<=sayi; i++ ){
            if (i%3==0 && i%4==0 ){
               toplam +=i;
               sayiAdet+=1;
            }
        }
        ortalama=toplam/sayiAdet;
        System.out.println("3 ve 4'e bölünen sayıların toplamının ortalaması:" +ortalama);
        }
}
