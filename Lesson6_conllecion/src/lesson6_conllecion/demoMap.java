/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6_conllecion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 98tae
 */
public class demoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("lab_1", 10);
        myMap.put("lab_2", 7);
        myMap.put("lab_3", 8);
        
        System.out.println(myMap);
        
    }
    
}
