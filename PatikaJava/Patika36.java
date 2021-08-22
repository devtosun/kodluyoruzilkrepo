package PatikaJava;

import java.util.Scanner;

public class Patika36 {

    static void pattern(int number, int temp, boolean isStarted) {
        if (isStarted) {
            System.out.print(number + " ");
            if (number <= 0) {
                isStarted = false;
            } else {
                number -= 5;
            }
            pattern(number, temp, isStarted);
        } else {
            if (number >= temp) {
                return;
            } else {
                number += 5;
                System.out.print(number + " ");
            }
            pattern(number, temp, isStarted);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();
        inp.close();

        pattern(number, number, true);
        System.out.print("\n");
    }
}
