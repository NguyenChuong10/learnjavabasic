package com.company.baitapwhile;

import java.util.Scanner;

public class DemChuSo {
    public static void main(String[] args) {
        int number , count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương bất kỳ : ");

        number = scanner.nextInt();
        while(number <= 0) {
            System.out.println("Số nhập phải lớn hơn 0 . Mời bạn nhập lại");
            number = scanner.nextInt();
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Số các chữ số = " + count);
    }
}
