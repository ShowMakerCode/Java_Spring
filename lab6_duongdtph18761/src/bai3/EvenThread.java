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
public class EvenThread implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i%2==0) {
                System.err.println(" "+i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException ex) {
                   ex.printStackTrace();
                }
            }
        }
    }
    
}
