package UcgenAlanHesaplama;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {

        int a, b, c;

        Scanner klavye = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz : ");
        a = klavye.nextInt();
        while (a < 0) {
            System.out.print("Kenar uzunluğu negatif olamaz.Tekrar giriniz : ");
            a = klavye.nextInt();
        }

        System.out.print("2. kenar uzunluğunu giriniz : ");
        b = klavye.nextInt();
        while (b < 0) {
            System.out.print("Kenar uzunluğu negatif olamaz.Tekrar giriniz : ");
            b = klavye.nextInt();
        }

        System.out.print("3. kenar uzunluğunu giriniz : ");
        c = klavye.nextInt();
        while (c < 0) {
            System.out.print("Kenar uzunluğu negatif olamaz.Tekrar giriniz : ");
            c = klavye.nextInt();
        }
        System.out.println();

        int u = (a+b+c)/2;
        int cevre = 2*u;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Kenar Uzunlukları : " + a+"-"+b+"-"+c);
        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);
    }
}
