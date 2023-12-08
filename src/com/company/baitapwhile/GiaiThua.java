package com.company.baitapwhile;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        int n, temp = 1;
        long giaiThua = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập váo số nguyên n : ");
        n = scanner.nextInt();
        while ((n <= 0) || (n > 10)) {
            System.out.println("Nhập lại số n : ");
            n = scanner.nextInt();
        }

        while (temp <= n) {
         giaiThua *= temp;
         temp++;
        }
        System.out.println(n + " ! = " + giaiThua);
    }
}