package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1.sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("Lütfen 2.sayıyı giriniz :");
        n2 = input.nextInt();
        System.out.print("Seçiminiz :");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölüm :" + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                } default:
                    System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");


        }
    }
}