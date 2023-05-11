package com.company.toantusosanh;

import java.util.Scanner;

public class ToantuSosanh {
    public static void main (String[] args) {
        int fisrtVariable;
        int secondVariable;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số 1 : "  );
        fisrtVariable = scanner.nextInt();
        System.out.print("Nhập số 2 : ");
        secondVariable = scanner.nextInt();
        System.out.println(" 1 : so sánh biến số 1 : "+fisrtVariable+ " và biến số 2 là : " +secondVariable );
        System.out.println("     kết quả cho ra là : "+((fisrtVariable == secondVariable)));
        System.out.println(" 2 : so sánh biến số 1 : "+fisrtVariable+ " và biến số 2 là : " +secondVariable );
        System.out.println("     kết quả cho ra là : "+((fisrtVariable >= secondVariable)));
        System.out.println(" 3 : so sánh biến số 1 : "+fisrtVariable+ " và biến số 2 là : " +secondVariable );
        System.out.println("     kết quả cho ra là : "+((fisrtVariable <= secondVariable)));
        System.out.println(" 4 : so sánh biến số 1 : "+fisrtVariable+ " và biến số 2 là : " +secondVariable );
        System.out.println("     kết quả cho ra là : "+((fisrtVariable > secondVariable)));
        System.out.println(" 5 : so sánh biến số 1 : "+fisrtVariable+ " và biến số 2 là : " +secondVariable );
        System.out.println("     kết quả cho ra là : "+((fisrtVariable < secondVariable)));
        System.out.println(" 6 : so sánh biến số 1 : "+fisrtVariable+ " và biến số 2 là : " +secondVariable );
        System.out.println("     kết quả cho ra là : "+((fisrtVariable != secondVariable)));
    }
}
