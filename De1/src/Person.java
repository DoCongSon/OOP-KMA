/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class Person {

    private String hoTen, ngaySinh, diaChi, gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public void hienThi() {
        System.out.println("ho ten: " + this.hoTen);
        System.out.println("ngay sinh: " + this.ngaySinh);
        System.out.println("dia chi: " + this.diaChi);
        System.out.println("gioi tinh: " + this.gioiTinh);

    }

    @Override
    public String toString() {
        return hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
