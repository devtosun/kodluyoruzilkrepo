package PatikaJava;

import java.util.Scanner;

public class PatikaJava11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığnı giriniz : ");
        int sicaklik = input.nextInt();
        input.close();

        if (sicaklik < 5) {
            System.out.println("Kayak etkinliğine katılabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        } else {
            System.out.println("Denize yüzmeye gidebilirsiniz.");
        }
    }
}
