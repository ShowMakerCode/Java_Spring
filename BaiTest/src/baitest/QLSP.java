/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitest;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class QLSP implements DAO{
        public ArrayList<SanPham> list;
    public QLSP(){
        this.list = new ArrayList<>();
    }
    
    
    @Override
    public void Insert(SanPham s) {
     this.list.add(s);
    }

    @Override
    public void Update(int Location,SanPham s) {
       this.list.set(Location, s);
    }

    @Override
    public void Delete(int Location) {
        this.list.remove(Location);
    }

    @Override
    public ArrayList<SanPham> getlist() {
       return this.list ;
    }

    @Override
    public void setlist(ArrayList<SanPham> list) {
       this.list = list;
    }
    
}
