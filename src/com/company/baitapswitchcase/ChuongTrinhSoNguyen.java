package com.company.baitapswitchcase;

import java.util.Scanner;

public class ChuongTrinhSoNguyen {
    public static void main(String[] args) {
        int aNumber , bNumber;
        Scanner sc = new Scanner(System.in);
        char kt ;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất : " );
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai : ");
        bNumber = scanner.nextInt();
        System.out.println("Nhập phép toán (+, - , * , / ) : ");
        kt = scanner.next().charAt(0);

        switch(kt){
            case '+':
                System.out.println(aNumber + " + " + bNumber + " = " + (aNumber + bNumber));
                break;
            case '-':
                System.out.println(aNumber + " - " + bNumber + " = " + (aNumber - bNumber));
                break;
            case '*':
                System.out.println(aNumber + " * " + bNumber + " = " + (aNumber * bNumber));
                break;
            case '/':
                if(bNumber == 0){
                    System.out.println("Số bị chia phải khác 0 .");
                }else {
                    System.out.println(aNumber + " / " + bNumber + " = " + (float) (aNumber / bNumber ));
                }
                break;
            default:
                System.out.println("Nhập phép tính không hơp lệ");
        }
    }

}
