/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SSP;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP01","gao",25000));
        ds.add(new SanPham("SP02","sua",25000));
        ds.add(new SanPham("SP03","sicula",25000));

        try{
            FileWriter fw = new FileWriter("sanpham.txt");
            for (SanPham sp : ds)
            {
                fw.write(sp.getMaso()+";"+sp.getTen()+";"+sp.getGia()+"\n");
            }
            fw.close();
            System.out.println("ghi thanh cong ");
        }catch(Exception ex)
        {
            System.out.println("loi xay ra: "+ex.toString());
            System.out.println("ghi file that bai");
        }
    }
    
}
