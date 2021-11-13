/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_mutil;

/**
 *
 * @author 98tae
 */
public class demoRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("-------------------------");
        System.out.println("xin chao IT17101");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new demoRunable());
        Thread t2 = new Thread(new demoRunable());

        
        System.out.println("------------------");       
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println("------------------");       
        t2.start();

    }
}
