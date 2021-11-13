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
public interface DAO {
    public void insert(svien s);
    public void update(svien s , int Location);
    public void delete(int Location);
    public void select();
    public ArrayList<svien> getList();
    public void setlist(ArrayList<svien> list);
    
}
