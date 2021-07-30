package PatikaJava;

import java.util.Scanner;

public class PatikaJava9 {
    public static void main(String[] args) {
        String dbUsername = "patika";
        String dbPassword = "java";

        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        username = input.nextLine();
        System.out.print("Parolayı giriniz : ");
        password = input.nextLine();

        if (username.equals(dbUsername) && password.equals(dbPassword)) {
            System.out.println("Giriş başarılı ...");
        } else if (username.equals(dbUsername) && !password.equals(dbPassword)) {
            System.out.print("Parolayı yanlış girdiniz! Parolayı sıfırlamak isterseniz 'evet' yoksa 'hayır'  : ");
            String cevap = input.nextLine();
            if (cevap.equals("evet")) {
                System.out.print("Yeni parola giriniz : ");

                boolean passwordIsValid = true;

                while (passwordIsValid) {
                    password = input.nextLine();
                    if (password.equals(dbPassword)) {
                        System.out.print("Eski parolanızdan farklı bir giriş yapınız : ");
                    } else {
                        System.out.println("Yeni parola oluşturma işlemi başarılı bir şekilde gerçekleşmiştir.");
                        dbPassword = password;
                        passwordIsValid = false;
                    }
                }

            } else {
                System.out.println("Herhangi bir işlem yapılmadı.");
            }
        } else {
            System.out.println("Hatalı kullanıcı adı girdiniz.");
        }
        input.close();
    }
}
