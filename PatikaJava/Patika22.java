package PatikaJava;

import java.util.Scanner;

public class Patika22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        input.close();

        int kalan = 0;
        int toplam = 0;

        while (number > 0) {
            kalan  = number - ((number / 10)*10);
            number -= kalan;
            number /= 10;
            toplam += kalan;        
        }
        System.out.println(toplam);  
    }
    
}
