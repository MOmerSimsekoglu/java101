import java.util.Scanner;

public class EnkucukEnBuyuk {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz:");
        int n=inp.nextInt();
        int i=1;
        int min=1;
        int max=1;
        while(n>=i){
            System.out.print(i+". Sayıyı giriniz:");
            int a= inp.nextInt();
            if(i==1){
                min=a;
                max=a;

            }
            else {
                if (a>max){
                    max=a;
                } else if (min>a) {

                    min=a;
                }
            }
            i++;
        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);


    }
}