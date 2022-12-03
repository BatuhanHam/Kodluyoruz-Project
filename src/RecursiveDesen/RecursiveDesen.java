package RecursiveDesen;

import java.util.Scanner;

public class RecursiveDesen {
    static int azaltDesen(int n){
        if (n<=0)
            return n;

        else{
            System.out.print(n + " ");
            return azaltDesen(n-5);
        }
    }
    static int arttirDesen(int ilkSayi, int sonSayi){
        if (ilkSayi>sonSayi)
            return ilkSayi;

        else{
            System.out.print(ilkSayi + " ");
            return arttirDesen(ilkSayi+5,sonSayi);
        }

    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = klavye.nextInt();

        arttirDesen(azaltDesen(n),n);

    }

}

