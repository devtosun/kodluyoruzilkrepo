package PatikaJava;

import java.util.Scanner;

public class Patika32 {

    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        inp.close();
        
        boolean palindrom = isPalindrom(n);
        if (palindrom == true) {
            System.out.println(n + " palindrom bir sayıdır");
        } else {
            System.out.println(n + " palindrom bir sayı değildir");
        }
    }


}
