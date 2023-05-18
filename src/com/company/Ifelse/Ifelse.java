package com.company.Ifelse;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra " );
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "la so chan");
        }else {
            System.out.println( number + "la so le");
        }
    }
}
