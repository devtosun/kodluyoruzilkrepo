package PatikaJava;

import java.util.Scanner;

public class PatikaJava10 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        inp.close();

        int notToplami = 0;
        double ortalama = 0.0;
        int bolen = 0;

        if (mat >= 0 && mat <= 100) {
            notToplami += mat;
            bolen++;
        }
        if (fizik >= 0 && fizik <= 100) {
            notToplami += fizik;
            bolen++;
        }
        if (kimya >= 0 && kimya <= 100) {
            notToplami += kimya;
            bolen++;
        }
        if (turkce >= 0 && turkce <= 100) {
            notToplami += turkce;
            bolen++;
        }
        if (muzik >= 0 && muzik <= 100) {
            notToplami += muzik;
            bolen++;
        }

        ortalama = notToplami / bolen;

        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
