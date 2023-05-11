package com.company.toantulyluandieukien;

import java.util.Scanner;

public class Toantulyluandienkien {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên : ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập số thứ hai  : ");
        secondNumber = scanner.nextInt();

        System.out.println("giá tri khi dùng ký từ && giữa hai số : " + firstNumber + " và " + secondNumber);
        System.out.println("trả về : " +((firstNumber<10) && (secondNumber<10)));
        System.out.println("giá tri khi dùng ký từ || giữa hai số : " + firstNumber + " hoặc " + secondNumber);
        System.out.println("trả về : " +((firstNumber==10) || (secondNumber<10)));
    }
}
