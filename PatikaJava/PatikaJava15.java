package PatikaJava;

import java.util.Scanner;

public class PatikaJava15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        int year = input.nextInt();
        input.close();

        int burc = year % 12;

        switch (burc) {
            case 0:
                System.err.println("Çin zodyağı burcunuz : Maymun");
                break;
            case 1:
                System.err.println("Çin zodyağı burcunuz : Horoz");
                break;
            case 2:
                System.err.println("Çin zodyağı burcunuz : Köpek");
                break;
            case 3:
                System.err.println("Çin zodyağı burcunuz : Domuz");
                break;
            case 4:
                System.err.println("Çin zodyağı burcunuz : Fare");
                break;
            case 5:
                System.err.println("Çin zodyağı burcunuz : Öküz");
                break;
            case 6:
                System.err.println("Çin zodyağı burcunuz : Kaplan");
                break;
            case 7:
                System.err.println("Çin zodyağı burcunuz : Tavşan");
                break;
            case 8:
                System.err.println("Çin zodyağı burcunuz : Ejderha");
                break;
            case 9:
                System.err.println("Çin zodyağı burcunuz : Yılan");
                break;
            case 10:
                System.err.println("Çin zodyağı burcunuz : At");
                break;
            case 11:
                System.err.println("Çin zodyağı burcunuz : Koyun");
                break;
            default:
                System.out.println("hatalı giriş yaptınız.");
                break;
        }
    }
}
