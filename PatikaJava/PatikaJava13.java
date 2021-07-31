package PatikaJava;

import java.util.Scanner;

public class PatikaJava13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğdunuz : ");
        int ay = input.nextInt();
        System.out.print("Kaçıncı gün doğdunuz : ");
        int gun = input.nextInt();
        input.close();


        if (ay == 3) {
            if (gun >= 21){
                System.out.println("Burcunuz : Koç");
            } else {
                System.out.println("Burcunuz : Balık");
            }
        }
        if (ay == 4) {
            if (gun >= 21){
                System.out.println("Burcunuz : Boğa");
            } else {
                System.out.println("Burcunuz : Koç");
            }
        }
        if (ay == 5) {
            if (gun >= 22){
                System.out.println("Burcunuz : İkizler");
            } else {
                System.out.println("Burcunuz : Boğa");
            }
        }
        if (ay == 6) {
            if (gun >= 23){
                System.out.println("Burcunuz : Yengeç");
            } else {
                System.out.println("Burcunuz : İkizler");
            }
        }
        if (ay == 7) {
            if (gun >= 23){
                System.out.println("Burcunuz : Aslan");
            } else {
                System.out.println("Burcunuz : Yengeç");
            }
        }
        if (ay == 8) {
            if (gun >= 23){
                System.out.println("Burcunuz : Başak");
            } else {
                System.out.println("Burcunuz : Aslan");
            }
        }
        if (ay == 9) {
            if (gun >= 23){
                System.out.println("Burcunuz : Terazi");
            } else {
                System.out.println("Burcunuz : Başak");
            }
        }
        if (ay == 10) {
            if (gun >= 23){
                System.out.println("Burcunuz : Akrep");
            } else {
                System.out.println("Burcunuz : Terazi");
            }
        }
        if (ay == 11) {
            if (gun >= 22){
                System.out.println("Burcunuz : Yay");
            } else {
                System.out.println("Burcunuz : Akrep");
            }
        }
        if (ay == 12) {
            if (gun >= 22){
                System.out.println("Burcunuz : Oğlak");
            } else {
                System.out.println("Burcunuz : Yay");
            }
        }
        if (ay == 1) {
            if (gun >= 22){
                System.out.println("Burcunuz : Kova");
            } else {
                System.out.println("Burcunuz : Oğlak");
            }
        }
        if (ay == 2) {
            if (gun >= 20) {
                System.out.println("Burcunuz : Balık");
            } else {
                System.out.println("Burcunuz : Kova");
            }
        }

    }
}
