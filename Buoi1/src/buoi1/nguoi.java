/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author 98tae
 */
public class nguoi {
    private String hoTen;
    private int gioiTinh;
    private String diaChi;
    private String QueQuan;

    public nguoi() {
    }   
    public nguoi(String hoTen, int gioiTinh, String diaChi, String QueQuan) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.QueQuan = QueQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    @Override
    public String toString() {
        return  "Họ Tên=" + hoTen + " gioiTinh:" + gioiTinh + ", diaChi=" + diaChi + ", QueQuan=" + QueQuan ;
    }
    
    
    public String xuatThongTin(){
        String ThongTin = this.hoTen +this.QueQuan+this.diaChi+this.gioiTinh;
        return ThongTin;
    
    }

    public String Getgioitinh(){
         if(gioiTinh == 0){
             return "nam";
        }else{
         return "nữ";
         }
         
    }
    
    
}
