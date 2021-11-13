      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author 98tae
 */
public class Product {
    static Scanner sc = new Scanner(System.in);
    String name;
    double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;       
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getImportTax(){
    return (this.price*10)/100;
    }


    public void Output() {
      System.out.println("_____________________");
      System.out.println("Name: " + this.name +"\n"+ "Price: "+this.price +"\n"+ "Thuế: "+this.getImportTax()); 
    }


    
}

