package YakinSayi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class YakinSayi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz: ");
        int n = klavye.nextInt();


        int[] list = new int[n];

        Random r = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(100);
        }
        System.out.println("Dizimiz : "+ Arrays.toString(list));
        arraySort(list);

        System.out.print("Kontrol Sayısı : ");
        int sayi = klavye.nextInt();

        for (int i = 0; i < list.length; i++) {

            if (list[i]>sayi){
                if (i == 0){
                    System.out.println("Sayıdan Büyük En Yakın Sayı : "+list[i]);
                    break;
                }
                if (i == (list.length - 1)){
                    System.out.println("Sayıdan Büyük En Yakın Sayı : "+list[i]);
                    System.out.println("Sayıdan Küçük En Yakın Sayı : "+list[i-1]);
                    break;
                }

                System.out.println("Sayıdan Büyük En Yakın Sayı : "+list[i]);
                System.out.println("Sayıdan Küçük En Yakın Sayı : "+list[i-1]);
                break;
            }
            else if (i == (list.length - 1)){
                if (list[i] == sayi){
                    System.out.println("Sayıdan Küçük En Yakın Sayı : "+list[i-1]);
                    break;
                }
                System.out.println("Sayıdan Küçük En Yakın Sayı : "+list[i]);
            }
            else if (list[i] == sayi){
                if (i == 0){
                    System.out.println("Sayıdan Büyük En Yakın Sayı : "+list[i+1]);
                    break;
                }
                System.out.println("Sayıdan Büyük En Yakın Sayı : "+list[i+1]);
                System.out.println("Sayıdan Küçük En Yakın Sayı : "+list[i-1]);
                break;
            }

        }




    }
    static void arraySort(int[] a){
        Arrays.sort(a);
        System.out.print("Sıralı Dizimiz: "+"[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]"+"\n");
            
        }
    }

