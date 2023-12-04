package com.company.baitapswitchcase;

import java.util.Scanner;

public class NhapNamHienThienNgay {
    public static void main (String [] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhâp tháng : ");
        month = scanner.nextInt();
        switch (month) {
            // những tháng có 31 ngày ;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng" + month + "có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày ");
                break;
            case 2 :
                int year;
                System.out.println("Mời bạn nhập vào năm muốn kiểm tra : ");
                year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("năm" + year + "bạn nhập có 28 ngày ");
                } else {
                    System.out.println("năm" + year + "bạn nhập có 29ngày ");
                }
                break;

            default:
                System.out.println("Tháng bạn nhập không hợp lệ ");


        }
    }
}
