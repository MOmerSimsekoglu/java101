import java.util.Scanner;


public class kullaniciGirisi {
    public static void main(String[] args) {
        String password = "patika", userName = "omer";
        while (true) {
            Scanner inp = new Scanner(System.in);

            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            String userNameInp = inp.nextLine();

            System.out.print("Lütfen şifrenizi giriniz: ");
            String passwordInp = inp.nextLine();

            if (userNameInp.equals(userName) && passwordInp.equals(password)) {
                System.out.println("Giriş Yapılıyor...");
                break;

            } else if (!userNameInp.equals(userName) && passwordInp.equals(password)) {

                System.out.println("Kullanıcı adınızı yanlış girdiniz!");
            } else if (!userNameInp.equals(userName) && !passwordInp.equals(password)) {

                System.out.println("Kullanıcı adı ve şifrenizi yanlış girdiniz!");
                System.out.println("Lütfen tekrar deneyiniz!!!");
            } else if (userNameInp.equals(userName) && !passwordInp.equals(password)){

                System.out.println("Şifrenizi yanlış girdiniz!");
                System.out.println("Şifrenizi yenilemek ister misiniz? E/H");
                String passwordTercih = inp.nextLine();
                while (true) {
                    if (passwordTercih.equals("E")) {
                        System.out.println("Lütfen yeni şifrenizi giriniz");
                        String newPassword = inp.nextLine();

                        if (!newPassword.equals(password) && !newPassword.equals(passwordInp)) {
                            System.out.println("Şifre oluşturuldu");
                            break;
                        }
                         else {
                            System.out.println("Şifre oluşturulamadı, Lütfen başka şifre giriniz.");

                        }
                    }
                    else {
                        System.out.print("Tekrar giriş yapmak ister misiz? E/H:");
                        String tercih=inp.nextLine();
                        if (tercih.equals("E")){
                            System.out.println("Tekrar Hoşgeldiniz...");
                            break;
                        }
                        else {
                            System.out.println("İyi günler dileriz...");
                            break;
                        }
                    }

                }
                break;
            }
        }
    }
}