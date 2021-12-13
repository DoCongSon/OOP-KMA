/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author sonan
 */
public class Customer extends Person{
    public String tenCongTy, triGiaHoaDon, danhGia;

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten cong ty: ");
        this.tenCongTy = sc.nextLine();
        System.out.println("nhap tri gia hoa don: ");
        this.triGiaHoaDon = sc.nextLine();
        System.out.println("nhap danh gia:");
        this.danhGia = sc.nextLine();
    }

    public Customer() {
    }

    public Customer(String tenCongTy, String triGiaHoaDon, String danhGia, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
        this.danhGia = danhGia;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(String triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    @Override
    public String toString() {
        return "hoTen: " + super.getHoTen() + ", diaChi: " + super.getDiaChi() + ", Tri gia hoa don: " + this.triGiaHoaDon;
    }
    
}
