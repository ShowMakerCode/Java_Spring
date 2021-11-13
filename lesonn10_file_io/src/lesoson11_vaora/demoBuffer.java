/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesoson11_vaora;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class demoBuffer {
    public static void main(String[] args) {
        String filename = "demo_Buffered_writer.txt";
        System.out.println("Ghi File");
        ghiFile(filename);
        System.out.println("fhi file thanh conmg");
        System.out.println("doc file");
        docFile(filename);
        System.out.println("doc file thanh cong");
    }
    
    
    
    
    public static void ghiFile(String name){
        try {
            FileWriter fw = new FileWriter(name);
            BufferedWriter bwriter = new BufferedWriter(fw);
            String[] txt = {
                "xin chào mng ",
                " học kì mới lè ",
                "lớp it 17101 môn MOB2023"
            };
            for (int i = 0; i < txt.length; i++) {
                 bwriter.write(txt[i]);
                
            }
            bwriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("ghi file that bai");
        }
    }
    
    public static void docFile(String name){
        try {
            FileReader fr = new FileReader(name);
            BufferedReader breader = new BufferedReader(fr);
            while (true) {                
                String txt = breader.readLine();
                if (txt == null) {
                    break;
                } else {
                    System.out.println(txt);
                }
            }
            
          
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
        
    }
}
