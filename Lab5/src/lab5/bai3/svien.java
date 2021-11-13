/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai3;

import java.io.Serializable;

/**
 *
 * @author 98tae
 */
public class svien implements Serializable{
        private String hoTen;
        private double luong;

    public svien() {
    }

    public svien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
         
    
}
