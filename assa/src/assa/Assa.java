/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assa;

/**
 *
 * @author 98tae
 */
public class Assa {

        
    public static void main(String[] args) {
        
        int S = 0;
        for (int i = 1; i < 50; i++) {
            
            S = S + (i/i+1);
            
        }
        
        System.out.println(S);
    }
    
}
