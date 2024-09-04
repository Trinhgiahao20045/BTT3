/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_2;

import SSP.SanPham;
import SSP.SanPham;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ObjectOutPutStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<SanPham> ds = new ArrayList<>();
       Scanner sc = new Scanner (System.in);
       try{
           FileOutputStream fos = new FileOutputStream("sanpham.biz");
           ObjectOutputStream oos= new ObjectOutputStream(fos);
           sc.nextLine();
           //nhap danh sach
           for(int i =0;i<3;i++){
               System.out.println("thong tin san pham "+(i+1));
               System.out.println("number:");
               String maso=sc.nextLine();
               System.out.println("name :");
               String ten=sc.nextLine();
               System.out.println("price: ");
               float gia=sc.nextFloat();
               SanPham sp= new SanPham(maso,ten,gia);
               ds.add(sp);
           }
           oos.writeObject(ds);
           oos.close();
           System.out.println("\n da ghi xong");
       }catch(Exception ex)
        {
            System.out.println("loi xay ra: "+ex.toString());
            System.out.println("ghi file that bai");
        }
    }
    
}
