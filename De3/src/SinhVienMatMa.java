/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class SinhVienMatMa extends Sinhvien{
    private String DonVi;
    private Float Luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB, String DonVi, Float Luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.DonVi = DonVi;
        this.Luong = Luong;
    }

    @Override
    public void HienThi() {
        super.HienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Don vi: " + this.DonVi);
        System.out.println("Luong: " + this.Luong);
    }

    @Override
    public String toString() {
        return super.toString() + ", donVi: " + this.DonVi + ", luong: " + this.Luong;
    }
    
}
