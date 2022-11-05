package KuvvetKontrol;

import java.util.Scanner;

public class KuvvetKontrol {
    public static void main(String[] args) {

        int n ;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n = klavye.nextInt();

        for (int i = 1; i <= n; i*=4) {
            System.out.println("4 ün kuvveti : "+i+" ");
        }
        System.out.println();

        for (int j = 1; j <=n; j*=5) {
            System.out.println("5 in Kuvveti : "+j);
        }

    }
}
