/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author 98tae
 */
public class Thread1_1 implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread2);
        
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        
        th1.start();
        th2.start();
        
        
    }

    @Override
    public void run() {
    
    }
    
}
