
import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen Tek Yön için 1'e, Gidiş-Dönüş için 2'ye basınız:");
        int yonTercihi= inp.nextInt();

        System.out.print("Lütfen gideceğiniz mesafeyi giriniz(km):");
        double mesafe= inp.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz:");
        int yas= inp.nextInt();
        inp.close();

        double normalTutar=mesafe*0.1;
        double yonIndirimi= (yonTercihi==1)? 0:0.2;
        double yasIndirimi=(yas<12)? 0.5:((yas>=12 && yas<=24) ? 0.1:((yas>24 && yas<=65)? 1:0.3));
        double toplamTutar=normalTutar-normalTutar*(yonIndirimi+yasIndirimi);
        if (yonTercihi==1 || yonTercihi==2){
            System.out.println("Uçak biletinizin toplam tutarı:"+ toplamTutar);

        }else {
            System.out.println("Hatalı Veri Girdiniz!!!");
        }


    }
}
