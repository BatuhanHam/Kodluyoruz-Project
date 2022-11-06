package HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        double toplam = 0.0;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        n = klavye.nextInt();

        for (int i = 1; i <=n ; i++) {
            toplam += (1.0/i);
            System.out.print("1/"+i + " , ");

        }
        System.out.print("\n"+"Harmonik toplam : "+String.format("%.1f",toplam));
    }
}
