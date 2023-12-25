package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maas = 24000;
        System.out.println("X Personelinin Çalıştığı Gün Sayısını Giriniz:");
        int gun_sayisi = in.nextInt();
        if(gun_sayisi == 25){
            System.out.println("Maaş: " + maas);
        } else if (gun_sayisi > 25) {
            maas = maas + ((gun_sayisi-25)* 1000);
            System.out.println("Maaş : " + maas);
        }
    }
}