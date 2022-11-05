package KombinasyonHesaplama;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n,r;
        int factn=1;
        int factr=1;
        int factnr=1;
        int kombinasyon;

        Scanner klavye = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n = klavye.nextInt();
        while (n<=0){
            System.err.print("Girilen değer 0 ve negatif olamaz.Tekrar giriniz :  ");
            n = klavye.nextInt();
        }

        System.out.print("r sayınısı giriniz : ");
        r = klavye.nextInt();
        while (r<=0){
            System.err.print("Girilen değer 0 ve negatif olamaz.Tekrar giriniz :  ");
            r = klavye.nextInt();
        }

        if (r<=n){
            for (int i = 1; i <=n ; i++) {
                factn *=i;
            }
            System.out.print("\n"+"Girilen n sayısının faktöriyeli : "+factn);

            for (int j = 1; j <=r ; j++) {
                factr *=j;
            }
            System.out.print("\n"+"Girilen r sayısının faktöriyeli : "+factr);

            for (int k = 1; k <=(n-r) ; k++) {
                factnr *=k;
            }
            System.out.print("\n"+"n-r sayısının faktöriyeli : " + factnr+ "\n");

            kombinasyon = factn/(factr*factnr);
            System.out.println("\n"+"Girilen Sayıların Kombinasyonu :" + kombinasyon);
        }
        else
            System.err.println("r sayısından büyük bir n değeri girip tekrar deneyiniz.");




    }
}
