package com.company.PrefixPostFix;

import java.util.Scanner;
public class PreFixPostFix {

    public static void main(String[] args) {
        int firstVariable = 5;
        int secondVariable = 7;
        int result = firstVariable++ + ++secondVariable - 8;
        System.out.println("firstVariable"+firstVariable);
        System.out.println("secondVariable"+secondVariable);
        System.out.println("result"+result);
    }

}
