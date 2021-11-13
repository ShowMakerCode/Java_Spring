/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataIOSSTream;

import SinhVien.Nguoi;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 98tae
 */
public class demomew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "aademo_Object.txt";
        System.out.println("Bắt Đầu Ghi File");
        ghiFile(filename);
        System.out.println("Ghi File Thành Công");

         System.out.println("Bắt Đầu đọc File");
        docFile(filename);
        System.out.println("đọc File Thành Công");
    }

    public static void ghiFile(String name) {
        try {
            FileOutputStream fos = new FileOutputStream(name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Nguoi n = new Nguoi("aaaa", 0, "hn", "hn");
            oos.writeObject(n);
            oos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("thất bại");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("thất bại");

        }

    }

    public static void docFile(String name) {
        try {
            FileInputStream fis = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Nguoi n = (Nguoi) ois.readObject();
            System.out.println(n.getHoTen());
            System.out.println(n.getDiaChi());
            System.out.println(n.getGioiTinh());
            System.out.println(n.getQueQuan());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("looxi");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
                System.out.println("looxi");
        }

    }

}
