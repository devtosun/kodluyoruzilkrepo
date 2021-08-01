package PatikaJava;

import java.util.Scanner;

public class PatikaJava16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz :");
        int yil = input.nextInt();
        input.close();

        if ((yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0 )) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
