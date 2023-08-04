package com.company.baitapifelse;

import java.util.Scanner;

public class SoSanhKhoangCach {
    public static void main (String[] args) {
        int x0 , y0 ,xM , yM ,R;
        String vitri;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập  x0 : ");
        x0 = sc.nextInt();
        System.out.println("nhập  y0 : ");
        y0 = sc.nextInt();
        System.out.println("nhập  xM : ");
        xM = sc.nextInt();
        System.out.println("nhập  yM : ");
        yM = sc.nextInt();
        System.out.println("nhập bán kính R : ");
        R = sc.nextInt();

        int khoangCach = (xM - x0) * (xM - x0) +
                (yM - y0) * (xM - y0);
        int banKinh = R*R;

        if(khoangCach > banKinh){
            vitri = "nằm bên ngoài đường tròn";
        }else if(khoangCach == banKinh) {
            vitri = "nằm trên đường tròn";
        }else {
            vitri = "nằm bên trong đường tròn";
        }
        System.out.println(vitri);
    }
}
