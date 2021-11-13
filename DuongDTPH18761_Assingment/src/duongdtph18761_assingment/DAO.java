/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongdtph18761_assingment;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public interface DAO {
    public void insert(NhanVien n);
    public void update(NhanVien n , int Location);
    public void delete(String id);
    public int sizeList();
    public void sett(int location , NhanVien n);
    public ArrayList<NhanVien> getList();
    public void setlist(ArrayList<NhanVien> list);
}
