package com.company.baitapifelse;

import java.util.Scanner;

public class ChuViTamGiac {
    public static void main (String[] args) {
        float canh1 , canh2 , canh3 ;
        float chuvi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh 1 : ");
        canh1 = sc.nextFloat();
        System.out.print("Nhập cạnh 2 : ");
        canh2 = sc.nextFloat();
        System.out.print("Nhập cạnh 3 : ");
        canh3 = sc.nextFloat();

        if((canh1 + canh2 > canh3)&&(canh1 + canh3 > canh2)&&(canh2 + canh3 > canh1)) {
            chuvi = canh1 + canh2 + canh3;
            System.out.println("chu vi của tam giác là : " + chuvi);
        }else {
            System.out.println("đây không phải là tam giác");
        }

    }
}
