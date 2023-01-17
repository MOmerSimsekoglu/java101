import java.util.Scanner;
public class etkinlikOneri {
    public static void main(String[] args) {


        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz:");

        double hava=inp.nextDouble();


        String oneri =(hava<5)? "Kayak yapabilirsiniz.":
                ((hava>=5 & hava<15) ? "Sinemaya gidebilirsiniz":
                ((hava>=15 & hava<25)  ? "Piknik yapabilirsiniz":
                ((hava>=25)? "Yüzmeye gidebilirsiniz":"asda")));
                 System.out.println(oneri);

        }
    }
