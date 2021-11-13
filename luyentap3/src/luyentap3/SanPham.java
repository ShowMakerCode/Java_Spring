/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap3;

import java.io.Serializable;

/**
 *
 * @author 98tae
 */
public class SanPham implements Serializable{
        private String maSach;
        private String tenSach;
        private int soLuong;
        private String tinhTrang;

    public SanPham() {
    }

    public SanPham(String maSach, String tenSach, int soLuong, String tinhTrang) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }


    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
        
        
}
