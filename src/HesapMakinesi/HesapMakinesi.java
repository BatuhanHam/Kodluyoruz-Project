package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double x,y;
        int select;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        x = klavye.nextDouble();

        System.out.print("Sayı giriniz : ");
        y = klavye.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Kuvvet Alma");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        select = klavye.nextInt();

       switch (select){
           case 1:
               System.out.println("Toplam : " + (x+y));
               break;
           case 2:
               System.out.println("Fark : " + (x-y));
               break;
           case 3:
               System.out.println("Çarpım : "+ String.format("%.2f",(x*y)));
               break;
           case 4:
               if (y!=0)
               System.out.println("Bölüm : " + (x/y));
               else
                   System.out.println("Bir sayı sıfıra bölünemez.");
               break;
           case 5:
               System.out.println("Sayının kuvveti : " + String.format("%.2f",Math.pow(x,y)));
               break;
           default:
               System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");
       }


    }
}
