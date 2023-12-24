package com.company.baitapfor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhTrungBinhCong {
    public static void main(String[] args) {
        int n , sum = 0 , number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Nhập vào các số nguyên  có trong dãy : ");

        n = scanner.nextInt();

        for( int count = 1 ; count <= n ; count++){
            System.out.println("nhập vào số thứ : " +count);
            number =scanner.nextInt();
            sum += number;
        }

            avgNumber = (float)sum/n;
            System.out.println("Trung bình công = " +decimalFormat.format(avgNumber));
    }
}
