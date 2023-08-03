package com.company.baitapifelse;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main (String[] args) {
        float diemHeSo1 , diemHeSo2 , diemThi ,diemTrungBinh;
        String ketquaxeploai;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhập điểm hệ số 1 ");
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        diemHeSo1 = sc.nextFloat();
        System.out.println("nhập điểm hệ số 2 ");
        diemHeSo2 = sc.nextFloat();
        System.out.println("nhập điểm thi ");
        diemThi = sc.nextFloat();

        if((diemHeSo1 < 0 || diemHeSo1 > 10 ) || (diemHeSo2 < 0 || diemHeSo2 > 10 ) || (diemThi < 0 || diemThi > 10 )){
            System.out.println("Điểm không hợp lệ");
        }else {
            diemTrungBinh = (float) ((((diemHeSo1 + diemHeSo2 * 2.0) / 3) * 0.4) + (diemThi * 0.6));
            decimalFormat.format(diemTrungBinh);

            if(diemTrungBinh >= 8.5) {
                ketquaxeploai = "Loại A";
            }else if ((diemTrungBinh >=7) && (diemTrungBinh < 8.5)){
                ketquaxeploai = "Loại B";
            }else if ((diemTrungBinh >=5.5) && (diemTrungBinh < 7)) {
                ketquaxeploai = "Loại C";
            }else if ((diemTrungBinh > 4) && (diemTrungBinh < 5.5)) {
                ketquaxeploai = "Loại D";
            }else{
                ketquaxeploai = "Loại F";
            }
            System.out.println(" điểm trung bình của học sinh là " + diemTrungBinh);
            System.out.println("Kết quả xếp loại môn học của sinh viên là " + ketquaxeploai);
        }

    }
}
