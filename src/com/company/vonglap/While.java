package com.company.vonglap;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        while (sum < 100) {
            System.out.println("nhập số nguyên bất kỳ  : ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println ("Số : " +sum+ "đã lớn hơn 100");
    }
}
