/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author 98tae
 */
public class QLSV implements DAO{
    ArrayList<SINHVIEN> list;
    
    public QLSV(){
        list = new ArrayList<>();
    }
    
    @Override
    public void insert(SINHVIEN s) {
        list.add(s);
    }

    @Override
    public void Update(int Location, SINHVIEN s) {
        list.set(Location, s);
    }

    @Override
    public void Delete(int Location) {
       list.remove(Location);
    }

    @Override
    public void Select() {
        return;
    }

    @Override
    public ArrayList<SINHVIEN> getList() {
       return this.list = list;
    }

    @Override
    public void setList(ArrayList<SINHVIEN> list) {
       this.list = list;
        
    }

    @Override
    public ArrayList<SINHVIEN> SXNAME() {
        Comparator<SINHVIEN> com = new Comparator<SINHVIEN>() {
            @Override
            public int compare(SINHVIEN o1, SINHVIEN o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
         Collections.sort(list, com);      
        return null;
    }

    @Override
    public ArrayList<SINHVIEN> SXDIEM() {
         Comparator<SINHVIEN> com = new Comparator<SINHVIEN>() {
            @Override
            public int compare(SINHVIEN o1, SINHVIEN o2) {
              double d1 = o1.getDiem();
                    double d2 = o2.getDiem();
                return Double.compare(d1, d2) ;
                    
            }
        };
         Collections.sort(list, com);
   return null;
    }

    
   
}
