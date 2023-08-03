package com.company.baitapifelse;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main (String [] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn muốn kiểm tra có phải năm nhuận hay không ");
        number = sc.nextInt();

        if(number % 4 ==0 ){
            if(number % 100 == 0){
                if(number % 400 == 0){
                    System.out.println("năm" +number+ "bạn nhập  là năm nhuận ");
                }
                else {
                    System.out.println("năm" +number+ "bạn nhập không phải là năm nhuận ");
                }

            }else {
                System.out.println("năm" +number+ "bạn nhập không phải là năm nhuận ");
            }
        }else {
            System.out.println("năm" +number+ "bạn nhập không phải là năm nhuận ");
        }


    }
}
