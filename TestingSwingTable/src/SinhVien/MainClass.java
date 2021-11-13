package SinhVien;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        QLDanhSachInterface qlds = new QuanLyDanhSach();

        Scanner sc = new Scanner(System.in);
        QuanLyDanhSach ql = new QuanLyDanhSach();
        Nguoi n = new Nguoi();
        System.out.println("hoTen");
        String hoTen = sc.nextLine();
        System.out.println("gioi tinh");
        int gioitinh = Integer.parseInt(sc.nextLine());
        System.out.println("queQuan");
        String queQuan = sc.nextLine();
        System.out.println("diaChi");
        String diaChi = sc.nextLine();
        ql.them(new Nguoi(hoTen, 0, queQuan, diaChi));   
        ql.select();
    }
}
