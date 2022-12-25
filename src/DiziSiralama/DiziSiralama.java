package DiziSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz : ");
        int size = klavye.nextInt();
        int[] list = new int[size];

        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(i+1 + ". Eleman:");
            list[i] = klavye.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralı Dizimiz : "+Arrays.toString(list));
    }
}
