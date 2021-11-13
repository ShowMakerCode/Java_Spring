/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author 98tae
 */
public class SINHVIEN {

    private String hoTen;
    private double diem;
    private String Nganh;
    private String Thuong;

    public SINHVIEN() {
    }

    public SINHVIEN(String hoTen, float diem, String Nganh, String Thuong) {
        this.hoTen = hoTen;
        this.diem = diem;
        this.Nganh = Nganh;
        this.Thuong = Thuong;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getThuong() {
        return Thuong;
    }

    public void setThuong(String Thuong) {
        this.Thuong = Thuong;
    }

    public String getGrade() {
        if (this.diem < 3) {
            return "Kém";
        }
        if (this.diem < 5) {
            return "Yếu";
        }
        if (this.diem < 6.5) {
            return "Trung bình";
        }
        if (this.diem < 7.5) {
            return "Khá";
        }
        if (this.diem < 9) {
            return "Giỏi";
        }
         if (this.diem <= 10) {
            return "Xuat Sac";
        }
        return null;
    }


}

