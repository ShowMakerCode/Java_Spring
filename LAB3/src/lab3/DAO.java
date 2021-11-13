/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public interface DAO {
    public void insert(SINHVIEN s);
    public void Update(int Location , SINHVIEN s);
    public void Delete(int Location);
    public void Select();
    public ArrayList<SINHVIEN> getList();
    public void setList(ArrayList<SINHVIEN> list);
    public  ArrayList<SINHVIEN> SXNAME();
    public  ArrayList<SINHVIEN> SXDIEM();
    
}
