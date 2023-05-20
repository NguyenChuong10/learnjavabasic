package com.company.IfelseIfelse;

import java.util.Scanner;

public class IfelseIfelse {
    public static void main(String[] args) {
        float number;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" nhap so can so sanh " );
        number =scanner.nextFloat();

        if(number > 10){
            System.out.println("So nhap lon hon 10");
        }else if(number == 10){
            System.out.println("So nhap bang 10");

        }else{
            System.out.println("so nhap be hon 10 ");
        }
    }
}
