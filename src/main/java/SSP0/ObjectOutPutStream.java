/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SSP0;

import SSP.SanPham;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class ObjectOutPutStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SanPham[] arrsp = new SanPham[2];
        arrsp[0]=new SanPham("SP01","sua",40000);
        arrsp[0]=new SanPham("SP01","snack",20000);
        arrsp[0]=new SanPham("SP01","sua",30000);
        
        try {
            FileOutputStream fos = new FileOutputStream ("sp.bin");
//            DataOutputStream dos = new DataOutputStream (fos);
//            for(SanPham sp :arrsp)
//            {
//                dos.writeUTF(sp.getMaso());
//                dos.writeUTF(sp.getTen());
//                dos.writeFloat( sp.getGia());
//            }
//            dos.close();
            //tao luong ghi 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //thuc hien ghi du lieu vao tap tin
            oos.writeObject(arrsp);
            //thuc hien dong luong
            oos.close();
            System.out.println("Da ghi xong");
        }catch(Exception ex)
        {
            System.out.println("Loi xay ra:"+ex.toString());
            System.out.println("thao tac ghi tap tin that bai ");
        }
    }
    
}
