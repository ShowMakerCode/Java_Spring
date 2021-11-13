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
public class SinhVien extends nguoi{
    private String MaSV;
    private String chuyenNganh;

    public SinhVien() {
    }


    public SinhVien(String MaSV, String chuyenNganh, String hoTen, int gioiTinh, String diaChi, String QueQuan) {
        super(hoTen, gioiTinh, diaChi, QueQuan);
        this.MaSV = MaSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + "Mã Sinh Viên : " + MaSV + ", Chuyên Ngành :" + chuyenNganh;
    }
    
    
    @Override
     public String xuatThongTin(){
     String Info =   super.xuatThongTin();
       return this.MaSV + this.chuyenNganh + Info;
       
    
    }
}
