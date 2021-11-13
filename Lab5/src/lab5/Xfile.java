/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

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
public class Xfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] data = Xfile.read("C:\\Users\\98tae\\Desktop\\a.gif",null);
        Xfile.write("C:\\Users\\98tae\\Desktop\\b.gif",data);
    }

    public static byte[] read(String path, byte[] data) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int i = fis.available();
            data = new byte[i];
            fis.read(data);
            fis.close();
             System.out.println("read thanh cong");
            return data;
           

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("loi");
        } catch (IOException ex) {
            ex.printStackTrace();
             System.out.println("loi");
        }
        return null;

    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
               System.out.println("write thanh cong");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
               System.out.println("loi");
        } catch (IOException ex) {
           ex.printStackTrace();
              System.out.println("loi");
        }

    }

  

}
