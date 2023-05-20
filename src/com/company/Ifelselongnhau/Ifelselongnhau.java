package com.company.Ifelselongnhau;

import java.util.Scanner;

public class Ifelselongnhau {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int threeNumber;
        int largestNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào số thứ nhất : ");
        firstNumber = scanner.nextInt();
        System.out.println(" Nhập vào số thứ hai : ");
        secondNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba : ");
        threeNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > threeNumber) {
                largestNumber = firstNumber;
            } else {
                largestNumber = threeNumber;
            }
        } else if (secondNumber > threeNumber) {
            largestNumber = secondNumber;

        } else {
            largestNumber = threeNumber;

        }
        System.out.println("số lớn nhấn trong ba số : " + firstNumber + "," + secondNumber + "," + threeNumber + " là " + largestNumber);
    }
}
