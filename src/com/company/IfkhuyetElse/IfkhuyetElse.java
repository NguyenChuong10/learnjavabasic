package com.company.IfkhuyetElse;

import java.util.Scanner;

public class IfkhuyetElse {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số 1  : " );
        firstNumber = scanner.nextInt();
        System.out.print("Nhập số 2 : ");
        secondNumber= scanner.nextInt();
        int minNumber = firstNumber;

        if(firstNumber > secondNumber)
            minNumber = secondNumber;
            System.out.println("số 1 là : "+firstNumber+ " lớn hơn số 2 là : "+secondNumber+" Số nhỏ nhất trong hai số là  : " +minNumber);


    }

}
