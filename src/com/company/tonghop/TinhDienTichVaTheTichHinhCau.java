package com.company.tonghop;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class TinhDienTichVaTheTichHinhCau {
    public static final float PI = 3.14f;
    public static void main(String[] args){
        float radius;
        float area;
        float vol;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Mời nhập bán kính : ");
        radius = scanner.nextFloat();
        area = (4/3)*PI * radius*radius*radius;
        vol =  4*PI*radius;
        System.out.println("Diện tích hình cầu là : " + decimalFormat.format(area));
        System.out.println("Thể tích hình cầu là  : " + decimalFormat.format(vol));



    }
}
