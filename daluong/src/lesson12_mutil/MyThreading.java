/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_mutil;

import lesson12Mutil.*;

/**
 *
 * @author 98tae
 */
public class MyThreading extends Thread{
    private String message;

    public void MyThreading(String Message){
        this.message = Message;
    }
    
    
    
    @Override
    public void run(){
    String txt = this.message;
        System.out.println(txt);
    }
    
}
