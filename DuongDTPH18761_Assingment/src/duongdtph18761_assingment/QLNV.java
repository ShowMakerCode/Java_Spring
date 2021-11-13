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
public class QLNV implements DAO {

    private ArrayList<NhanVien> list;

    public QLNV() {
        list = new ArrayList<>();
    }

    @Override
    public void insert(NhanVien n) {
        this.list.add(n);
    }

    @Override
    public void update(NhanVien n, int Location) {
        list.set(Location, n);
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < list.size(); i++) {
            NhanVien nv = list.get(i);
            if (id.equalsIgnoreCase(nv.getMaNV())) {
                list.remove(i);
            }

        }
    }
  

    @Override
    public int sizeList() {
        return list.size();

    }

    @Override
    public ArrayList<NhanVien> getList() {
        return this.list;
    }

    @Override
    public void setlist(ArrayList<NhanVien> list) {
        this.list = list;
    }

    @Override
    public void sett(int location, NhanVien n) {
        this.list.set(location, n);
    }

}
