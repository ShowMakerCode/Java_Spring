/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6_conllecion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author 98tae
 */
public class demooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2);
        mySet.add(1);
        mySet.add(3);
        mySet.add(4);

        mySet.add(6);

        System.out.println("---LIST-------");
        System.out.println(list);
        System.out.println("-----SET-----");
        System.out.println(mySet);
//        System.out.println("ri tơn ôn");
//        list.retainAll(mySet);
//        System.out.println(list);
//        System.out.println(mySet);
        System.out.println("------------shuffle---------");
        Collections.shuffle(list);
         System.out.println(list);
         System.out.println("---------------------");
         
         Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = Integer.parseInt(o1.toString());
                int i2 = Integer.parseInt(o2.toString());
                if (i1 == i2) {
                         return 0; 
                }else if (i1 > i2){
                    return 1;
                }else {
                    return  -1;
                }
                
            }
        };
       Collections.sort(list);
        System.out.println("list");
        System.out.println(list);
         Collections.reverse(list);
          System.out.println("list");
        System.out.println(list);
        
    }

}
