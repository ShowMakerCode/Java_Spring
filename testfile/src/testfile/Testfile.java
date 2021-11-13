/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class Testfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            readfile();
       
    }
    
    public static void readfile(){
        try {
            FileInputStream fis = new FileInputStream("duongdtph18761.dat");
            int i =fis.read();
            System.out.println(String.valueOf(i));
        } catch (FileNotFoundException ex) {
          ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    
    }
    
    
}
