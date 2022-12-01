package RecursiveAsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static void recursiveAsal(int a, int b) {
        if (a==b || a==2){
            System.out.println("Sayı asaldır.");
            return;
        }

        if (a == 1){
            System.out.println("Asal değildir.");
        return;
        }
             else if (a % b == 0){
            System.out.println("Asal değildir.");
        return;
             }


         recursiveAsal(a, b + 1);
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = klavye.nextInt();

       recursiveAsal(a,2);


    }
}
