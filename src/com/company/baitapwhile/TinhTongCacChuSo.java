package com.company.baitapwhile;

import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        int number , balance;
        int Sum = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen duong : ");

        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("So nhap phai lon hon 0 . Moi ban nhap lai :");
            number = scanner.nextInt();
        }
        while (number > 0 ) {
            balance = number % 10;
            Sum += balance;
            number /= 10;
        }
        System.out.println("Tong cac chu so = " + Sum);
    }
}
