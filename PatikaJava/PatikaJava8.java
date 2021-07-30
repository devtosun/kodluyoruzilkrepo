package PatikaJava;

import java.util.Scanner;

public class PatikaJava8 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz matematiksel işlemi seçiniz !");
        System.out.println("Toplama işlemi için 1");
        System.out.println("Çıkarma işlemi için 2");
        System.out.println("Çarpma işlemi için 3");
        System.out.println("Bölme işlemi için 4");
        int islem = input.nextInt(); 

        System.out.print("1. sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int b = input.nextInt();

        input.close();

        switch (islem) {
            case 1:
                System.out.println("Toplama işlemi sonucu : " + (a+b));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : " + (a-b));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : " + (a*b));
                break;
            case 4:
                double bolme =  Double.valueOf(a) / Double.valueOf(b);
                System.out.println("Bölme işlemi sonucu : " + bolme);
                break;
            default:
                System.out.println("Hatalı işlem");
                break;
        }

    }
}
