package PalindromikKelime;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kontrol edilecek kelimeyi giriniz : ");
        String klavye = input.nextLine();
        System.out.println("Kelime Palindormik mi? : "+isPalindrome(klavye));

    }
}
