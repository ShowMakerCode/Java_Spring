/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 98tae
 */
public class QuanLyDanhSach {
    private ArrayList<nguoi> list_ng;
    public Scanner sc = new Scanner(System.in);
    public QuanLyDanhSach(){
        list_ng = new ArrayList<>();
    }
    
    public void nhapTT(){
        nguoi nm = new nguoi();
        list_ng.add(nm);
    }    
    
    
    public void xuatt(){
        for (nguoi x : list_ng) {
            x.xuatThongTin();
        
        }
    }
}
