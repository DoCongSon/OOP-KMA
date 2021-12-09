/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

/**
 *
 * @author sonan
 */
public class HangHoa {
    private String maHang, ten;
    private int gia;

    public HangHoa() {
    }

   
    public HangHoa(String maHang, String ten, int gia) {
        this.maHang = maHang;
        this.ten = ten;
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    

    @Override
    public String toString() {
        return "ma hang hoa: " + maHang + "\nten: " + ten + "\ngia: " + gia;
    }
   
}
