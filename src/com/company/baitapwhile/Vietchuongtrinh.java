package com.company.baitapwhile;

import java.util.Scanner;

public class Vietchuongtrinh {
    public static void main (String [] args) {
        int number = 2 ;
        Scanner scanner =  new Scanner(System.in);

        while(number <= 20 ) {
            System.out.println(+number+"");
            number += 2;
        }
    }
}
