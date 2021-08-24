package PatikaJava;

import java.util.Scanner;

public class Patika44 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print((i+1) + ". sayıyı giriniz : ");
            arr[i] = inp.nextInt();
        }
        inp.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sıralama : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
