package AtmProject;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName,password;
        Scanner klavye = new Scanner(System.in);

        int right =3;
        int balance = 1500;
        int select;


        while (right>0){
            System.out.print("kullanıcı adınız : ");
            userName = klavye.nextLine();
            System.out.print("Parolanız : ");
            password = klavye.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("X Banka Sistemine Giriş Yaptınız.");
                break;
            }
            else {
                right--;
                System.err.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            }

            if (right==0)
                System.err.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
            else
                System.out.println("Kalan Hakkınız : " + right);

        }

        while (true){
            System.out.println("1-Para yatırma\n"+
                    "2-Para Çekme\n"+
                    "3-Bakiye Sorgulama\n"+
                    "4-Çıkış Yap");
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            select = klavye.nextInt();

            switch (select){
                case 1:
                    System.out.print("Yatırılan Para Miktarı : ");
                    int price = klavye.nextInt();
                    balance +=price;
                    break;

                case 2:
                    System.out.print("Çekilen Para Miktarı : ");
                    price = klavye.nextInt();
                    if (price>balance){
                        System.err.println("Bakiye yetersiz.\n");
                    }
                    else
                        balance -= price;
                    break;

                case 3:
                    System.out.println("Güncel Bakiyeniz : " + balance +"\n");
                    break;

                case 4:
                    System.out.println("Banka Sisteminden Çıkış Yapıldı. Yine Bekleriz.");
                    System.exit(0);
                    break;
            }
        }

    }
}
