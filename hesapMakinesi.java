import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String islemler= "1.Çarpma \n2.Bölme\n3.Toplama\n4.Çıkarma";
        System.out.print(islemler +"\n" + "Lütfen bir işlem seçiniz:");
        String secim= inp.nextLine();

        switch(secim){
            case "1":
                System.out.print("Birinci sayıyı giriniz:");
                double n1= inp.nextDouble();
                System.out.print("İkincici sayıyı giriniz:");
                double n2= inp.nextDouble();
                double carpma=n1*n2;
                System.out.println(n1 + "*" + n2 +"="+carpma);
                break;
            case "2":
                System.out.print("Birinci sayıyı giriniz:");
                double n3= inp.nextDouble();
                System.out.print("İkincici sayıyı giriniz:");
                double n4= inp.nextDouble();
                double bolme=n3/n4;
                System.out.println(n3 + "/" + n4 +"="+bolme);
                break;
            case "3":
                System.out.print("Birinci sayıyı giriniz:");
                double n5= inp.nextDouble();
                System.out.print("İkincici sayıyı giriniz:");
                double n6= inp.nextDouble();
                double toplama=n5+n6;
                System.out.println(n5 + "+" + n6 +"="+toplama);
                break;
            case "4":
                System.out.print("Birinci sayıyı giriniz:");
                double n7= inp.nextDouble();
                System.out.print("İkincici sayıyı giriniz:");
                double n8= inp.nextDouble();
                double cıkarma=n7-n8;
                System.out.println(n7 + "-" + n8 +"="+cıkarma);
                break;


        }
    }
}