import java.util.Scanner;
public class sayiSiralama {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen a sayiyi giriniz:");
        int a=inp.nextInt();
        System.out.print("Lütfen b sayiyi giriniz:");
        int b=inp.nextInt();
        System.out.print("Lütfen c sayiyi giriniz:");
        int c=inp.nextInt();

        if(a>b && a>c){
            String x= b>c ? "a>b>c":"a>c>b";
            System.out.println(x);
        }
        if(b>a && b>c){
            String x= a>c ? "b>a>c":"b>c>a";
            System.out.println(x);
        }
        if(c>a && c>b){
            String x= a>b ? "c>a>b":"c>b>a";
            System.out.println(x) ;
        }
    }
}