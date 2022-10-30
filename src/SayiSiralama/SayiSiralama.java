package SayiSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        int elemanSayisi;
        int temp;


        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizimizin eleman sayısını giriniz : ");
        elemanSayisi = klavye.nextInt();

        int[] dizi = new int[elemanSayisi];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1) + ". elemanını giriniz  : ");
            dizi[i] = klavye.nextInt();
        }
        System.out.println("Dizimiz : " + Arrays.toString(dizi));

        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j =0; j < dizi.length - 1 -i ; j++) {
                if (dizi[j]<dizi[j+1]){
                    temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;

                }
            }
        }
        System.out.println("Sıralanmış dizimiz : "+Arrays.toString(dizi));
    }
}
