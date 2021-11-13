/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap3;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class QLSP implements DAO{
    public ArrayList<SanPham> list ;
    public QLSP(){
    list = new ArrayList<>();
    
    }
    @Override
    public void Insert(SanPham s) {
     this.list.add(s);
    }

    @Override
    public void Update(int Location, SanPham s) {
    this.list.set(Location, s);
    }

    @Override
    public void Delete(int location) {
    this.list.remove(location);
    }

    @Override
    public ArrayList<SanPham> getList() {
        return this.list;
    
    }

    @Override
    public void setlist(ArrayList<SanPham> list) {
        this.list = list;
    }
    
}
