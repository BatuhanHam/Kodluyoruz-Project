package YildizTersUcgen;

import java.util.Scanner;

public class YildizTersUcgen {
    public static void main(String[] args) {

        int n;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Adım sayısını giriniz : ");
        n = klavye.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j =2*n-1; j >2*i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }


        }
    }
