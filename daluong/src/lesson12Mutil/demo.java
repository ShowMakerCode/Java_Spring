/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12Mutil;

/**
 *
 * @author 98tae
 */
public class demo extends Thread{
    private String message;

  

    public void demo(String Message){
        this.message = Message;
    }
    
    
    
    @Override
    public void run(){
    String txt = this.message;
        System.out.println(txt);
    }
    
}
