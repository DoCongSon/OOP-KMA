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
public class SanPham {
    private String maSanPhan, tenSanPham, ngaySanXuat;
    private int donGia;
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma san pham");
        this.maSanPhan = sc.nextLine();
        System.out.println("nhap ten san pham");
        this.tenSanPham = sc.nextLine();
        System.out.println("nhap ngay san xuat");
        this.ngaySanXuat = sc.nextLine();
        System.out.println("nhap don gia");
        this.donGia = sc.nextInt();
    }
    
    public SanPham() {
    }

    public SanPham(String maSanPhan, String tenSanPham, String ngaySanXuat, int donGia) {
        this.maSanPhan = maSanPhan;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.donGia = donGia;
    }

    public String getMaSanPhan() {
        return maSanPhan;
    }

    public void setMaSanPhan(String maSanPhan) {
        this.maSanPhan = maSanPhan;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPhan=" + maSanPhan + ", tenSanPham=" + tenSanPham + ", ngaySanXuat=" + ngaySanXuat + ", donGia=" + donGia + '}';
    }
    
}
