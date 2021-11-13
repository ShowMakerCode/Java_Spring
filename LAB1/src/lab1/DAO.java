/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author 98tae
 */
public interface DAO {
    public void insert(Product p);
    public void update(int Location , Product p);
    public void delete(int Location); 
    public void select();


}
