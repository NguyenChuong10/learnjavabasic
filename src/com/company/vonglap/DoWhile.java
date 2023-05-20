package com.company.vonglap;

import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args) {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số nguyên bạn muốn : ");
            number = scanner.nextInt();
          sum += number;

        }while(sum <100);
        System.out.println(" sô " +sum + " đã lơn hơn 100 rồi ");
    }
}
