import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
        double pi=3.14;

        Scanner inp= new Scanner(System.in);
        System.out.print("Lutfen dairenin yari capini giriniz:");
        int r= inp.nextInt();

        System.out.print("Lutfen alanı bulunacak dairenin acisini giriniz:");
        int a= inp.nextInt();
        double Alan= (pi*(r*r)*a)/360;

        System.out.println("a açili dairenin alani:"+Alan);
    }
}