import java.util.Scanner;

public class GelismisHesapMakinasi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma :" + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;

    }

    static double divided(int a, int b) {

        if (b == 0) {
            System.out.println("İkinci sayı 0'dan büyük olmalıdır!!!");
            return 0;
        } else {
            double result = a / b;
            System.out.println("Bölme : " + result);
            return result;
        }
    }

    static int mod(int a, int b) {

        if (b == 0) {
            System.out.println("İkinci sayı 0'dan büyük olmalıdır!!!");
            return 0;
        } else {
            int result = a % b;
            System.out.println("Mod : " + result);
            return result;
        }
    }

    static int rectangular(int a, int b) {
        int site = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Dikdörtgen: Alanı=" + site + " Çevresi=" + perimeter);
        return perimeter + site;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int select = 0;
        while (true) {

            String menu = "1-Toplama İşlemi\n"
                    + "2-Çıkarma İşlemi\n"
                    + "3-Çarpma İşlemi\n"
                    + "4-Bölme İşlemi\n"
                    + "5-Mod Alma\n"
                    + "6-Dikdörtgen Alan ve Çevre\n"
                    + "0- Programdan Çık\n";
            System.out.println(menu);


            System.out.print("Lütfen bir işlem seçiniz: ");
            select = inp.nextInt();
            if (select == 0) {
                System.out.println("Güle Güle");
                break;
            }
            System.out.print("Lütfen birinci sayıyı giriniz: ");
            int number1 = inp.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            int number2 = inp.nextInt();

            switch (select) {

                case 1:
                    sum(number1, number2);
                    break;
                case 2:
                    minus(number1, number2);
                    break;
                case 3:
                    times(number1, number2);
                    break;
                case 4:
                    divided(number1, number2);
                    break;
                case 5:
                    mod(number1, number2);
                    break;
                case 6:
                    rectangular(number1, number2);
                    break;

            }

        }


    }
}