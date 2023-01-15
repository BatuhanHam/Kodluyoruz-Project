package SayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right<5){
            System.out.println("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if (selected<0 || selected>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : "+ (5-right));
                }
                else {
                    isWrong = true;
                    System.out.println("Bir  daha hatalı girişinizde hakkınızdan düşülecektir.");

                }
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı :"+number);
                isWin = true;
                break;
            }
            else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected>number){
                    System.out.println(selected+" sayı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayı gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkı : " + (5 - right) );
            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
