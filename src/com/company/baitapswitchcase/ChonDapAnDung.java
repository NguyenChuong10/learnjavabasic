package com.company.baitapswitchcase;

import java.util.Scanner;

public class ChonDapAnDung {
    public static void main(String[] args) {
        char result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cách nào cho phép người dùng khai báo 1 giá trị boolean " + "trong 4 đáp án sau ");
        // dấu \ " sẽ được hiện thị ra màn hình là ";
        System.out.println("a. boolean bool3 = \"1\";");
        System.out.println("b. boolean bool2 = \"true\";");
        System.out.println("c. boolean bool1 = true;");
        System.out.println("a. boolean bool4 = 1;");

        System.out.println("Mời bạn nhập vào đáp án : ");
         result = scanner.next().charAt(0);
         switch(result) {
             case 'a':
             case 'b':
             case 'd':
                 System.out.println("Bạn chọn đáp án bị sai");
                 break;
             case 'c':
                 System.out.println("Bạn chọn đáp án đúng");
                 break;
             default:
                 System.out.println("bạn chọn đáp án không hợp lệ");
         }


    }

}
