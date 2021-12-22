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
public class SanPhamNhap {
    private SanPham sp;
    private int soLuong;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.sp = new SanPham();
        this.sp.nhap();
        System.out.println("Nhap so luong:");
        this.soLuong = sc.nextInt();
    }
    
    public void xuat() {
        System.out.println(this.sp);
        System.out.println("so luong: " + this.soLuong);
    }

    public SanPhamNhap() {
    }

    public SanPhamNhap(SanPham sp, int soLuong) {
        this.sp = sp;
        this.soLuong = soLuong;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
