package PatikaJava;

import java.util.Scanner;

public class PatikaJava1 {

    public static void main(String[] args) {
       Scanner not = new Scanner(System.in);

       System.out.println("Matematik notunuz:");
       int matematik = not.nextInt(); 

       System.out.println("Fizik notunuz:");
       int fizik = not.nextInt();

       System.out.println("Kimya notunuz:");
       int kimya = not.nextInt();

       System.out.println("Türkçe notunuz:");
       int turkce = not.nextInt();

       System.out.println("Tarih notunuz:");
       int tarih = not.nextInt();

       System.out.println("Müzik notunuz:");
       int muzik = not.nextInt();
       
       not.close();
       
       double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
       System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }

}
