import java.util.Scanner;

public class ortalamaHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat, fizik, kimya, turkce, muzik;

        System.out.print("Lütfen Matematik Notuzu giriniz:");
        mat = inp.nextInt();
        System.out.print("Lütfen Fizik Notuzu giriniz:");
        fizik = inp.nextInt();
        System.out.print("Lütfen Kimya Notuzu giriniz:");
        kimya = inp.nextInt();
        System.out.print("Lütfen Türkçe Notuzu giriniz:");
        turkce = inp.nextInt();
        System.out.print("Lütfen Müzik Notuzu giriniz:");
        muzik = inp.nextInt();
        if (!(mat >= 0 && mat <= 100) && (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)
                && (turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)) {
            double avarage = (fizik + kimya + turkce + muzik) / 4;
            if (avarage >= 55) {
                System.out.println("Sınıfı geçtiniz! Tebrikler!");
                System.out.println("Ortalamanız="+avarage);
            } else {
                System.out.println("Sınıfta Kaldınız!");
                System.out.println("Ortalamanız="+avarage);
            }
        } else if ((mat >= 0 && mat <= 100) && !(fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)
                && (turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)) {
            double avarage = (mat + kimya + turkce + muzik) / 4;
            if (avarage >= 55) {
                System.out.println("Sınıfı geçtiniz! Tebrikler!");
                System.out.println("Ortalamanız="+avarage);
            } else {
                System.out.println("Sınıfta Kaldınız!");
                System.out.println("Ortalamanız="+avarage);
            }
        } else if ((mat >= 0 && mat <= 100) && (fizik >= 0 && fizik <= 100) && !(kimya >= 0 && kimya <= 100)
                && (turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)) {
            double avarage = (fizik + mat + turkce + muzik) / 4;
            if (avarage >= 55) {
                System.out.println("Sınıfı geçtiniz! Tebrikler!");
                System.out.println("Ortalamanız="+avarage);
            } else {
                System.out.println("Sınıfta Kaldınız!");
                System.out.println("Ortalamanız="+avarage);
            }
        } else if ((mat >= 0 && mat <= 100) && (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)
                && !(turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)) {
            double avarage = (fizik + mat + kimya + muzik) / 4;
            if (avarage >= 55) {
                System.out.println("Sınıfı geçtiniz! Tebrikler!");
                System.out.println("Ortalamanız="+avarage);
            } else {
                System.out.println("Sınıfta Kaldınız!");
                System.out.println("Ortalamanız="+avarage);
            }
        } else if ((mat >= 0 && mat <= 100) && (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)
                && (turkce >= 0 && turkce <= 100) && !(muzik >= 0 && muzik <= 100)) {
            double avarage = (fizik + mat + kimya + turkce) / 4;
            if (avarage >= 55) {
                System.out.println("Sınıfı geçtiniz! Tebrikler!");
                System.out.println("Ortalamanız="+avarage);
            } else {
                System.out.println("Sınıfta Kaldınız!");
                System.out.println("Ortalamanız="+avarage);
            }
        } else if ((mat >= 0 && mat <= 100) && (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)
                && (turkce >= 0 && turkce <= 100) && (muzik >= 0 && muzik <= 100)) {
            double avarage = (fizik + mat + kimya + turkce + muzik) / 5;
            if (avarage >= 55) {
                System.out.println("Sınıfı geçtiniz! Tebrikler!");
                System.out.println("Ortalamanız="+ avarage);
            } else {
                System.out.println("Sınıfta Kaldınız!");
                System.out.println("Ortalamanız="+avarage);
            }
        }

    }
}