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
public class DienThoai extends HangHoa{
    private String nhaSanXuat, dungLuong, mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSanXuat, String dungLuong, String mauSac, String maHang, String ten, int gia) {
        super(maHang, ten, gia);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "ma hang hoa: " + super.getMaHang() + "\nten: " + super.getTen() + "\ngia=" + super.getGia() + "\nnha san xuat: " + nhaSanXuat + "\ndung luong: " + dungLuong + "\nmau sac: " + mauSac; //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
