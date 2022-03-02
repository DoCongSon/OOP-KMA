/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sonan
 */
public class NhanVien extends Person{
    private String phongBan;
    private float HSL, luongCoBan;
    private int thamNien;

    public NhanVien(String phongBan, float HSL, float luongCoBan, int thamNien, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.HSL = HSL;
        this.luongCoBan = luongCoBan;
        this.thamNien = thamNien;
    }

    public NhanVien() {
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongThucLinh() {
        return this.luongCoBan * this.HSL * (1 + (float) this.thamNien / 100);
    }

    @Override
    public void hienThi() {
        super.hienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Phong ban: " + this.phongBan);
        System.out.println("HSL: " + this.HSL);
        System.out.println("Luong co ban: " + this.luongCoBan);
        System.out.println("Tham niem: " + this.thamNien);
        System.out.println("Luong thuc linh: " + this.getLuongThucLinh());
    }

    @Override
    public String toString() {
        return ("Ho ten: " + super.getHoTen() + "\n"
                + "Ngay sinh: " + super.getNgaySinh() + "\n"
                + "Dia chi: " + super.getDiaChi() + "\n"
                + "Gioi tinh: " + super.getGioiTinh() + "\n"
                + "Phong ban: " + this.phongBan + "\n"
                + "HSL: " + this.HSL + "\n"
                + "Luong co ban: " + this.luongCoBan + "\n"
                + "Tham niem: " + this.thamNien + "\n"
                + "Luong thuc linh: " + this.getLuongThucLinh() + "\n");
    }
}
