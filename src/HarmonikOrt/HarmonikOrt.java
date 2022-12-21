package HarmonikOrt;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class HarmonikOrt {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz :");
        int n = klavye.nextInt();
        double sum = 0.0;
        double[] list = new double[n] ;

        for (int i = 1; i <= list.length; i++) {
            list[i-1] = Math.random()*100+1;
            sum+=(1.0/list[i-1]);
        }
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(String.format(" %.2f",list[i])+" --");
        }
        System.out.print("]"+"\n");

        double harmOrt = list.length/sum;
        System.out.println("Harmonik Ortalama : "+String.format("%.2f",harmOrt));
    }
}
