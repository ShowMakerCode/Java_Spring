/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author 98tae
 */
public class mainClass {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyDanhSach ql = new QuanLyDanhSach();

        while (true) {
            menu();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    ql.nhapTT();
                    break;
                case 2:
                    ql.xuatt();
                    break;

                case 3:
                    nguoi sv = new SinhVien("sv001", "it", "dong thau dyong", 0, "so 132 Cau giay ", "bac giang");
                    sv.xuatThongTin();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }

    }

    public static void menu() {
        System.out.println("_____________________________________________________");
        System.out.println("1. Thêm mới 1 đối tượng");
        System.out.println("3. Xuất danh sách đối tượng ");
        System.out.println("3.Sinh Viên");
        System.out.println("0.DỪng ");
        System.out.println("_____________________________________________________");
    }
}
