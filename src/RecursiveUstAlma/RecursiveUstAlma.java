package RecursiveUstAlma;

public class RecursiveUstAlma {
    static int recursiveUst(int a, int b) {
        if (b == 0 || a == 1)
            return 1;

        else
            return a*recursiveUst(a, --b);
    }

    public static void main(String[] args) {
        System.out.println(recursiveUst(3, 4));  //Girilen 1. sayı taban 2. sayı üstür.

    }
}
