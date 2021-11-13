/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.bai3;

/**
 *
 * @author 98tae
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLNV ql = new QLNV();
        ql.insert(new svien("aaaaa", 100000));
        ql.select();
        
    }
    
}
