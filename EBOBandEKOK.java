import java.util.Scanner;

public class EBOBandEKOK {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);

        System.out.print("Lütfen n1 sayısını giriniz:");
        int n1 = inp.nextInt();

        System.out.print("Lütfen n2 sayısını giriniz:");
        int n2 = inp.nextInt();
        int ebob=1;

            if (n1>=n2){
                int i=n2;
                while(i>=1){
                    if (n1%i==0 && n2%i==0){
                        ebob=i;
                        break;
                    }
                    i--;
                }
                System.out.println("n1 ve n2 sayılarının EBOB'u :"+ebob);
        }
        else{
            int k=n1;
            while(k>=1){
                if (n1%k==0 && n2%k==0){
                    ebob=k;
                    break;
                }
                k--;
            }
            System.out.println("n1 ve n2 sayılarının EBOB'u :"+ebob);
        }
        int ekok= (n1*n2)/ebob;
        System.out.println("n1 ve n2 sayılarının EKOK'u :"+ekok);
    }
}