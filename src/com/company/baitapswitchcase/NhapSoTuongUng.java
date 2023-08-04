package com.company.baitapswitchcase;

import java.util.Scanner;

public class NhapSoTuongUng {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số  để chọn thứ : ");
        number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Chủ nhật ");
                break;
            case 2:
                System.out.println("thứ 2 ");
                break;
            case 3:
                System.out.println("thứ 3 ");
                break;
            case 4:
                System.out.println("thứ 4 ");
                break;
            case 5:
                System.out.println("thứ 5 ");
                break;
            case 6:
                System.out.println("thứ 6 ");
                break;
            case 7:
                System.out.println("thứ 7 ");
                break;
            default:
                System.out.println("Mời bạn nhập lại số ");
        }
    }
}