package PatikaJava;


import java.util.Scanner;

public class Patika41 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        inp.close();

        int[] numbers = {15,12,788,1,-1,-778,2,0};

        int alt = -778;
        int ust = 778;
        for (int i : numbers) {
            if (i < n && i > alt) {
                alt = i;
            }
            if (i > n && i < ust) {
                ust = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + alt);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + ust);
    }
}
