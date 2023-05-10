package com.company.PrefixPostFix;

import java.util.Scanner;
public class PreFixPostFix {

    public static void main(String[] args) {
        int firstVariable = 5;
        int secondVariable = 7;
        int result = firstVariable++ + ++secondVariable - 8;
        System.out.println("firstVariable : " +firstVariable);
        System.out.println("secondVariable : " +secondVariable);
        System.out.println("result : " +result);
    }
    /*  ++secondVariable là tiền tố : preefix
        bước 1 :  sử lý tiền tố trước
        bước 2 :  sử lý các phép toán còn lại sau đó trả về biến bên trái dấu bằng
        bước 3 :  cuối cùng sử lý hậu tố của nó
        firstVariable-- là hậu tố */

}
