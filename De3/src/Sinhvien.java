/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class Sinhvien {
    private String maSV, hoTen, ngaySinh, gioiTinh;
    private float diemTB;

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }
    
    public void HienThi() {
        System.out.println("Ma SV: " + this.maSV);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Diem TB: " + this.diemTB);
    }

    @Override
    public String toString() {
        return "maSV: " + maSV + ", hoTen: " + hoTen + ", ngaySinh: " + ngaySinh + ", gioiTinh: " + gioiTinh + ", diemTB: " + diemTB;
    }
    
}
