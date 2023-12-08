package com.company.baitapwhile;

import java.util.Scanner;

public class TinhTienTaxi {
    public static void main(String[] args) {
        float km;
        Scanner scanner = new Scanner(System.in);
        long money = 0;
        final int STARTING_PEE = 14000;
        final int NEXT_TO_25KM = 16300;
        final int FROM_26KM_ONWARDS = 13300;

        System.out.println("Nhập vào sô km đã đi :");
        km = scanner.nextFloat();

        while (km < 0) {
            System.out.println("Số km nhập vào phải lớn hơn 0 ,Mời bạn nhập lại : ");
            km = scanner.nextInt();
        }
        if (km <= 0.8) {
            money = 14000;
        } else if (km <= 25) {
            money = (long) (STARTING_PEE + NEXT_TO_25KM * (km - 0.8));

        } else {
            money = (long) (STARTING_PEE + 16300 * (25 - 0.8) + 13300 * (km - 25 - 0.8));

        }
        System.out.println("Số tiền đi " + km + "km = " +money+ "Đồng.");
    }
}