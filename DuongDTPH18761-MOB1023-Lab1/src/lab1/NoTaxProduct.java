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
public class NoTaxProduct extends Product{

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }
   @Override
    public void setPrice(double price) {
        this.price = price;
    }
      
        @Override
        public double getImportTax(){
       return 0;
    }
    
     
        
        @Override
  public void select(){
      System.out.println("_____________________");
      System.out.println("Name: " + super.name +"\n"+ "Price: "+super.price +"\n"+ "Thuế: "+getImportTax()); 
     
  }
    
}
