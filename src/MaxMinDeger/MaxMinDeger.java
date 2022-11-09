package MaxMinDeger;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDeger {
    public static void main(String[] args) {
        int elemanSayisi;
        int sayi;
        int max;
        int min;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz : ");
        elemanSayisi = klavye.nextInt();


        int[] dizi = new int[elemanSayisi];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayıları giriniz : ");
            sayi = klavye.nextInt();
            dizi[i] = sayi;

        }
        System.out.println("Girilen Sayılar : "+Arrays.toString(dizi));

        max = dizi[0];
        min = dizi[0];

        for (int i = 1; i <dizi.length ; i++) {
            if (dizi[i]>max){
                max = dizi[i];
            }
            if (dizi[i]<min){
                min = dizi[i];
            }
        }
        System.out.println("Dizinin en büyük değeri : "+max);
        System.out.println("Dizinin en küçük değeri :"+min);





    }
}
