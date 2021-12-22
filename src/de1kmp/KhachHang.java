/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1kmp;

import java.util.Scanner;

/**
 *
 * @author sonan
 */
public class KhachHang {
    private String maKhachHang, tenKhachHang, namSinh;
    private DiaChi diaCHi;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma khach hang");
        this.maKhachHang = sc.nextLine();
        System.out.println("nhap ten khach hang");
        this.tenKhachHang = sc.nextLine();
        System.out.println("nhap nam sinh");
        this.namSinh = sc.nextLine();
        this.diaCHi = new DiaChi();
        this.diaCHi.nhap();
    }
    
    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String namSinh, DiaChi diaCHi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.namSinh = namSinh;
        this.diaCHi = diaCHi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public DiaChi getDiaCHi() {
        return diaCHi;
    }

    public void setDiaCHi(DiaChi diaCHi) {
        this.diaCHi = diaCHi;
    }
    
}
