package KullaniciGirisi;

import java.util.Scanner;
import java.util.Objects;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String password,userNameEntered;
        String userName = "patika";
        Scanner klavye = new Scanner(System.in);
        String[] donut = {"EVET","HAYIR"};
        String oldPassword = "java123";



        System.out.print("Kullanıcı adını giriniz : ");
        userNameEntered = klavye.nextLine();

        while (!userNameEntered.equals(userName)){
            System.err.println("Kullanıcı adı hatalı. Tekrar giriniz : ");
            userNameEntered = klavye.nextLine();
        }

        System.out.print("Şifrenizi giriniz : ");
        password = klavye.nextLine();

        if (userNameEntered.equals(userName) && password.equals(oldPassword))
            System.out.println("Giriş yaptınız.");


        else if (!password.equals(oldPassword)){
            System.out.println("Girilen şifre yanlış.Sıfırlamak istermisiniz.EVET/HAYIR");
            String cevap = klavye.nextLine();

            if (Objects.equals(cevap, donut[0])){
                System.out.print("Yeni şifrenizi giriniz : ");
                String newPassword = klavye.nextLine();

                while (newPassword.equals(password) ) {
                    System.err.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz : ");
                    newPassword = klavye.nextLine();

                }
                 while (newPassword.equals(oldPassword)){
                    System.err.println("Şifreniz eski şifre ile aynı olmamalıdır.Lütfen başka şifre giriniz : ");
                    newPassword = klavye.nextLine();
                }
                    System.out.println("Şifre oluşturuldu.");

            }


        }


    }
}
