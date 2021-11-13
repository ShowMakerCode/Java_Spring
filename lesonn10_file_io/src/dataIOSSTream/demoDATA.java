/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataIOSSTream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class demoDATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String filename = "demoDATA.txt"    ;
        System.out.println("Bắt Đầu Ghi File");
        ghiFile(filename);
        System.out.println("Ghi File Thành Công");
        
        
         System.out.println("Bắt Đầu đọc File");
        docFile(filename);
        System.out.println("đọc File Thành Công");
    }
    
       public static void ghiFile(String name ){
        try {
            FileOutputStream fos = new FileOutputStream(name);
            DataOutputStream DataOS =  new DataOutputStream(fos);
             int i = 20;
//             String ze = "haha";
             char c = 'u';
                DataOS.writeInt(i);
                DataOS.writeChar(c);
              DataOS.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
            System.out.println("thất bại");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("thất bại");
        
        }
         
       
       
       }
       
       
       public static void  docFile(String name){
           FileInputStream fis = null;
        try {         
            fis = new FileInputStream(name);
            DataInputStream dataIS = new DataInputStream(fis);
           
           int i =  dataIS.readInt();
           char c = dataIS.readChar();
            System.out.println(i);
            System.out.println(c);
           fis.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
           
           
        
        
        
    }
    
}
