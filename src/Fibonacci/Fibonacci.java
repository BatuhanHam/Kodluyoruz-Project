package Fibonacci;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        int toplam =0;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Eleman Sayısı : ");
        n = klavye.nextInt();

        int[] dizi = new int[n];
        dizi[0] = 1;
        dizi[1]=1;

        for (int i = 2; i <n ; i++) {

            dizi[i]= dizi[i-1]+dizi[i-2];
        }

        System.out.print("Fibonacci Serimiz : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");

        }

        }
    }
