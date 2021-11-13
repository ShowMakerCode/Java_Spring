/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 98tae
 */
public class QLProduct implements DAO {

    public static Scanner sc = new Scanner(System.in);
    ArrayList<Product> list;
    public static Product pr = new Product();

    public QLProduct() {
        list = new ArrayList<>();
    }

    @Override
    public void insert(Product p) {
        list.add(p);

    }

    @Override
    public void delete(int Location) {
        this.list.remove(Location);
    }

    @Override
    public void update(int Location, Product p) {
        list.set(Location, p);
    }

    @Override
    public void select() {
        for (Product product : list) {
            product.Output();
        }

    }


    public void deleteAll() {  
        if(list.size() < 1){
            System.out.println("");
        }else{
        
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        for (int i = 1; i < list.size() + 1; i++) {
            list.remove(i);
        }
        int zed = 0;
        list.remove(zed);

    }}
    
    

}
