package PatikaJava;

import java.util.Scanner;

public class Patika26 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int a = inp.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int b = inp.nextInt();
        inp.close();

        //ebob
        int tempA = a;
        int tempB = b;
        int ebob = 1;
        int i = 2;
        while (i <= tempA){
            if (tempA % i == 0 && tempB % i == 0){
                ebob *= i;
                tempA /= i;
                tempB /= i;
                continue;
            }
            i++;
        }
        System.out.println("Ebob = " + ebob);

        //ekok
        int ekok = (a*b) / ebob;
        System.out.println("Ekok = " + ekok);

    }
}
