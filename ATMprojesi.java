import java.util.*;

public class ATMprojesi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int balance=1000;
        int right=3;

        while (right>0){

            System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
            String userName=inp.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz:");
            String userPassword=inp.nextLine();
            if (!userName.equals("omer") && userPassword.equals("1234")){
                right--;
                System.out.println("Kullanıcı Adınızı Yanlış Girdiniz!!!");
                System.out.println("Kalan Hakkınız:"+right);
            }
            else if (userName.equals("omer") && !userPassword.equals("1234")){
                right--;
                System.out.println("Şifrenizi Yanlış Girdiniz!!!");
                System.out.println("Kalan Hakkınız:"+right);
            }
            else if (!userName.equals("omer") && !userPassword.equals("1234")){
                right--;

                System.out.println("Şifrenizi ve Kullanıcı Adınızı Yanlış Girdiniz!!!");
                System.out.println("Kalan Hakkınız:"+right);

            }else {String steps1;
                do{
                    String steps = "1. Balance\n" + "2. Deposit Money\n" + "3. Withdraw Money\n" + "4. Quit\n";
                    System.out.println("-----------------------------------------------");
                    System.out.println(steps);
                    System.out.println("-----------------------------------------------");
                    System.out.print("Bir İşlem Seçiniz:");
                    steps1 = inp.nextLine();

                    switch (steps1) {
                        case "1":
                            System.out.println("Bakiyeniz:" + balance + " TL");
                            break;

                        case "2":
                            System.out.print("Lütfen Yatırmak İstediğiniz Miktarı Giriniz:");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Güncel Bakiyeniz:" + balance + " TL");
                            break;

                        case "3":
                            System.out.print("Lütfen Çekmek İstediğiniz Miktarı Giriniz:");
                            int price1 = inp.nextInt();
                            if (price1 >balance ) {
                                System.out.println("Bakiyeniz Yetersizdir!!!");
                                break;
                            } else {
                                balance -= price1;
                                System.out.println("Güncel Bakiyeniz:" + balance + " TL");
                                break;
                            }
                        default:
                            System.out.println("Hatalı İşlem Seçtiniz. Lütfen Tekrar Deneyiniz!!!");
                            break;
                    }
                }while(!steps1.equals("4"));
                    System.out.println(" İyi Günler Dileriz...");
                    break;
            }
        }
    }
}
