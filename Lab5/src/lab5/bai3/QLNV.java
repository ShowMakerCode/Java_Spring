/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai3;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class QLNV  implements DAO {
    private ArrayList<svien>list;
    public QLNV(){
        list = new ArrayList<>();
    }

    @Override
    public void insert(svien s) {
       this.list.add(s);
    }

    @Override
    public void update(svien s, int Location) {
     this.list.set(Location, s);
    }

    @Override
    public void delete(int Location) {
       list.remove(Location);
    }

    @Override
    public void select() {
        for (svien object : list) {
            System.out.println(object.getHoTen());
            System.out.println(object.getLuong());
        }
    }

    @Override
    public ArrayList<svien> getList() {
        return this.list;
    }

    @Override
    public void setlist(ArrayList<svien> list) {
       this.list = list;
    }
}
