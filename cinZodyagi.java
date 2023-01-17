import java.util.*;
public class cinZodyagi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz:");
        int yil=inp.nextInt();
        int kalan=yil%12;

        switch (kalan){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz Maymun'dur");
                break;

            case 1:
                System.out.println("Çin Zodyağı Burcunuz Horoz'dur");
                break;

            case 2:
                System.out.println("Çin Zodyağı Burcunuz Köpek'dir");
                break;

            case 3:
                System.out.println("Çin Zodyağı Burcunuz Domuz'dur");
                break;

            case 4:
                System.out.println("Çin Zodyağı Burcunuz Fare'dir");
                break;

            case 5:
                System.out.println("Çin Zodyağı Burcunuz Öküz'dür");
                break;

            case 6:
                System.out.println("Çin Zodyağı Burcunuz Kaplan'dır");
                break;

            case 7:
                System.out.println("Çin Zodyağı Burcunuz Tavşan'dır");
                break;

            case 8:
                System.out.println("Çin Zodyağı Burcunuz Ejderha'dır");
                break;

            case 9:
                System.out.println("Çin Zodyağı Burcunuz Yılan'dır");
                break;

            case 10:
                System.out.println("Çin Zodyağı Burcunuz At'dır");
                break;

            case 11:
                System.out.println("Çin Zodyağı Burcunuz Koyun'dur");
                break;

        }

    }
}