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
public class QLProduct {
    public static Scanner sc = new Scanner(System.in);
    ArrayList<Product> list;
    public static Product pr = new Product();
    
    public  QLProduct(){
        list = new ArrayList<>();
}  


    public void add(Product p){
        list.add(p);
    }

    public void nhapsp(){
     Product pr1 = new Product();
         System.out.println("Mời Nhâp Name");
        pr.setName(sc.nextLine());
         System.out.println("Mời Nhập Price");
        pr.setPrice(Double.parseDouble(sc.nextLine()));
        list.add(pr1);
    
    }
    public void Nhaptest(){
         
        list.add(new Product("Sản phẩm 1", 1000000));
        list.add(new Product("Sản phẩm 2", 2000000));
        list.add(new Product("Sản phẩm 3", 3000000));
        list.add(new Product("Sản phẩm 4", 4000000));
        list.add(new Product("Sản phẩm 5", 5000000));
    }
    
    public void insert(Product p) {
      list.add(p);
     
    
    }
    
    public void xuatsp(){
        for (Product product : list) {
            product.select();
        }
            
        
    }
      public void deleteAll() {  // đây là chỗ em debug phần bài 3 để k bị nhập liệu chèn vào bảng 
         // (yêu cầu chỉ có 3 cột nên em dùng cột này remove all dữ liệu trong đây để sau đó add thông tin bài 3 vào list)
          for (int i = 0; i < list.size(); i++) {
             list.remove(i);
                 }
          for (int i = 1; i < list.size()+1; i++) {
             list.remove(i);         
          } 
        int zed = 0;   
       list.remove(zed);
    
    }

    public void delete(int Location) {
   
        list.remove(Location);
        pr.delete(Location);
        
    }
    
    
    
    public void Update(int Location , Product p){

        list.set(Location, p);
        pr.update(Location, p);
    
    }
    public void dodai(){
        int lengttt = list.size();
    }
}
