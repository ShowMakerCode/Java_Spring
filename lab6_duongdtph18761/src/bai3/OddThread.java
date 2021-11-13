/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class OddThread implements Runnable{

    
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if(i%2 != 0){
                System.out.println("so le " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            
        }
    }
    
}
