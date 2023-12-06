package com.company.baitapwhile;

import java.util.Scanner;

public class TimUoclonnhatVaBoinhonhat {
    public static void main (String[] args) {

        int firstNumber, secondNumber,temp1,temp2, uscln, bscnn;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất : ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai  : ");
        secondNumber = scanner.nextInt();

        while((firstNumber <= 0)&&(secondNumber <=0 )){
            System.out.println("Mời bạn nhập lại số lớn hơn 0 ");
            System.out.println("Nhập vào số thứ nhất : ");
            firstNumber = scanner.nextInt();
            System.out.println("Nhập vào số thứ hai  : ");
            secondNumber = scanner.nextInt();

        }
        temp1 = firstNumber;
        temp2 = secondNumber;
        while(temp1 != temp2) {
            if(temp1 > temp2){
                temp1 -= temp2 ;
            }else{
                temp2 -= temp1;
            }
        }
        uscln = temp1 ;
        bscnn = (firstNumber*secondNumber)/uscln;
        System.out.println("ước sô chung của hai số " +firstNumber+"," +secondNumber+ " là : "+uscln);
        System.out.println("Bội số chung nhỏ nhất của hai số "+firstNumber+"," +secondNumber+ " là : "+bscnn);
    }
}
