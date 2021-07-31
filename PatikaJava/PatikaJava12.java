package PatikaJava;

import java.util.Scanner;

public class PatikaJava12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz :");
        int a = input.nextInt();

        System.out.print("2. sayıyı giriniz :");
        int b = input.nextInt();
        
        System.out.print("3. sayıyı giriniz :");
        int c = input.nextInt();
        input.close();

        int temp;
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Büyükten küçüğe sıralama : " + a + " " + b + " " + c);


    }
}
