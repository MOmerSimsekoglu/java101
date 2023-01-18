import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class dongulerKobinasyon {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen N sayısını giriniz:");
        int n=inp.nextInt();

        System.out.print("Lütfen R sayısını giriniz:");
        int r=inp.nextInt();

        int fark=n-r;
        int total=1;
        int total1=1;
        int total2=1;

        for (int i=1; i<=n; i++){
            total *=i;
        }

        for (int j=1; j<=r; j++){
            total1 *=j;
        }

        for (int k=1; k<=fark; k++){
            total2 *=k;
        }
        double comb= total/(total1*total2);
        System.out.println(n + " ile " + r+ "'nin kombinasyonu:"+comb);
    }
}
