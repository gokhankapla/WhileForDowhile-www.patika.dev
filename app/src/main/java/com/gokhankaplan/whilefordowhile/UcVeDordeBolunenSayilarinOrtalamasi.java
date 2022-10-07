package com.gokhankaplan.whilefordowhile;

import java.util.Scanner;

public class UcVeDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int a, b, toplam, ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        a = input.nextInt();
        toplam = 0;
        b = 0;

        for (int i=1; i<=a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                b++;

            }

        }
        ortalama = toplam / b;
        System.out.println("Ortalama:" + ortalama);
    }
}
