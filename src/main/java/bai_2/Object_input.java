/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2;

import SSP.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Object_input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds;
        try {
            FileInputStream fis = new FileInputStream("sanpham.biz");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois .readObject();
            ois.close();
            System.out.println("\n da doc xong");
            for(SanPham sp : ds) {
                System.out.println(sp);
                
            }
        }catch (Exception ex) {
            System.out.println("Loi xay ra " + ex.toString());
        }
    }
    
}
