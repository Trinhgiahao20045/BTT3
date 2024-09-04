/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SSP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham>ds=new ArrayList<>();
        try{
            FileReader rd = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(rd);
            String data=null;
            while((data=br.readLine())!=null)
            {
                System.out.println(data);
            }
            br.close();
        }catch(Exception ex){
            System.out.println("Loi xay ra "+ex.toString());
            System.out.println("Doc file that bai");
        }
    }
    
}
