package com.company.baitapdowhile;

import java.util.Scanner;

public class TimSo {
    public static void main(String[] args) {
       int m = 0 , n , sum =0 ;
       Scanner scanner = new Scanner(System.in);
       do{
           System.out.println("Nhập vào sô nguyên n : ");
           n = scanner.nextInt();
       }while(n < 0);

       while((sum + m) < n){
           sum += ++m;
           System.out.println(m);
           if((sum+m) < n){
               System.out.println(" + ");
           }
       }
       if(sum > 0) {
           System.out.println(" = " + sum + " <= " + n);
       }
       System.out.println("m lớn nhất = " +m);
    }
}
