/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class QLUSER implements DAO{
    ArrayList<Usermanagent> list ;
    public QLUSER(){
        list = new ArrayList<>();
        
    } 

    @Override
    public void Insert(Usermanagent userr) {
       list.add(userr);
    }

    @Override
    public void Update(int Location, Usermanagent userr) {
      list.set(Location, userr);
    }

    @Override
    public void Delete(int Location) {
      list.remove(Location);
    }

    @Override
    public void Select() {
        for (Usermanagent x : list) {
            x.InThongTin();
        }
    }

    @Override
    public ArrayList<Usermanagent> getList() {
       return this.list = list;
    }

    @Override
    public void setlist(ArrayList<Usermanagent> list) {
        this.list = list;
    
    }


    
    
    
    
}
