/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 98tae
 */
public class SinhVien {
    Scanner sc = new Scanner(System.in);
    private String ten;
    private int  tuoi;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "sc=" + sc + ", ten=" + ten + ", tuoi=" + tuoi + ", diem=" + diem + '}';
    }
    
    
    public void Nhaptt(){
        System.out.println("Mời Nhập Tên");
        ten = sc.nextLine();
        System.out.println("Tuổi");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Điểm");
        diem = Double.parseDouble(sc.nextLine());
    }
    
    public void InTT(){
        System.out.println("Tên "+ten+"\n"+"tuổi :"+tuoi+"\n"+"Điểm : "+diem);
    }
    
}
