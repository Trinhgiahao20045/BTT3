/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SSP;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SanPham implements Serializable {
        public String maso;
        public String ten;
        public float gia;

    public SanPham() {
    }

    public SanPham(String maso, String ten, float gia) {
        this.maso = maso;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", gia=" + gia + '}';
    }
}
