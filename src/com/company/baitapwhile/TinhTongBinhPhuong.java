package com.company.baitapwhile;

import java.util.Scanner;

public class TinhTongBinhPhuong {
    public static void main(String[] args) {
        int n , i = 1 ;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương n : ");
        n = scanner.nextInt();

        while( n <= 0) {
            System.out.println("Nhập lại số nguyên dương n : ");
            n = scanner.nextInt();
        }
        while ( i<= n ) {
            sum += i*i;
            i++;
        }
        System.out.println("Tổng = " + sum );
    }
}
