/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesonn10_file_io;

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
public class fileIOStream {

    public fileIOStream(String name) {
    }

    public static void main(String[] args) {
        String filename = "yamate.txt"    ;
        System.out.println("Bắt Đầu Ghi File");
        ghiFile(filename);
        System.out.println("Ghi File Thành Công");
        
        
         System.out.println("Bắt Đầu Ghi File");
        docFile(filename);
        System.out.println("Ghi File Thành Công");
    }
    
       public static void ghiFile(String name ){
        try {
            FileOutputStream fos = new FileOutputStream(name);
            String txt = "chào mng , chao nè";
           byte[] b = txt.getBytes();
            fos.write(b);
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
            System.out.println("thất bại");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("thất bại");
        
        }
         
       
       
       }
       
       
       public static void  docFile(String name){
        try {
            FileInputStream fis = new FileInputStream(name);
//                  fis.read
//            String txt = new String (b);
//            System.out.println(txt);
//             while (fis.available() != 0){
//             int i = fis.read();
//             char c = (char) i;
//                 System.out.print(c);
//            }
//                 System.out.println("");   


//           byte[] b = new byte[fis.available()];
//            fis.read(b);
//            String txt = new String(b);
//            System.out.println(txt);
                 
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
            System.out.println("lỗi");
        } catch (IOException e ){
        e.printStackTrace();
            System.out.println("lỗi");
        }
           
       
       }
       
       
    
}
