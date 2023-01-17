import java.util.*;
public class artikYil {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.println("Lütfen yıl giriniz:");
        int yil=inp.nextInt();

        if (yil%100==0){
            if (yil%400==0){
            System.out.println(yil+" bir artık yıldır !");
            }
            else{
                System.out.println(yil + " bir artık yıl değildir !");
        }
        }
        else if (yil%4==0){
            System.out.println(yil+" bir artık yıldır !");
        }
        else{
            System.out.println(yil + " bir artık yıl değildir !");
            }

        }

    }
