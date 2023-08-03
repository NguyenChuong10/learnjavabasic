package com.company.baitapifelse;

import java.util.Scanner;

public class SoSanhDiem {
    public static void main (String[] agrs) {
        float diemThi , diemThanhphan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm thi của bạn");
        diemThi = sc.nextFloat();
        System.out.println("Nhâp điểm thành phần của bạn");
        diemThanhphan = sc.nextFloat();
        if(diemThi > diemThanhphan) {
            System.out.println("Điểm thi lơn hơn điểm thành phần" );
        }else if (diemThi == diemThanhphan) {
            System.out.println("Điểm thi bằng điểm thành phần");
        }else {
            System.out.println("điểm thi bé hơn điểm thành phần ");
        }
    }
}
