package com.company.baitapifelse;

import java.util.Scanner;

public class KiemTraSo {
    public static void main (String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số muốn kiếm tra");
        number = sc.nextInt();
        if(number > 5){
            System.out.println(" số bạn nhập lớn hơn 5 ");
        }else {
            System.out.println("Số bạn nhập nhỏ hơn 5");
        }
    }
}
