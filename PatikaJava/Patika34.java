package PatikaJava;

import java.util.Scanner;

public class Patika34 {

    static int recursive(int taban, int us){

        if (us > 1) {
            us--;
            taban *= recursive(taban, us);
        } else {
            return taban;
        }
        return taban;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        int taban = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us = inp.nextInt();
        inp.close();

        int result = recursive(taban, us);
        System.out.println("Sonuç : " + result);
    }
}
