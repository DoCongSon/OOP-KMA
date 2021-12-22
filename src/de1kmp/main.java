/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1kmp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sonan
 */
public class main {
    
    public static void menu() {
        System.out.println("1: nhap san pham");
        System.out.println("2: nhap them 1 khach hang");
        System.out.println("3: thay doi thong tin san pham");
        System.out.println("4: danh sach san pham");
        System.out.println("5: mua hang");
        System.out.println("6: khach mua nhieu nhat");
        System.out.println("0: thoat");
    }
    
    public static void main(String[] args) {
        ArrayList<SanPhamNhap> listSanPham = new ArrayList<SanPhamNhap>();
        ArrayList<KhachHang> listKhachHang = new ArrayList<KhachHang>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            menu();
            chon = sc.nextInt();
            switch(chon) {
                case 1:
                    System.out.println("nhap so san pham: ");
                    int soSanPham = sc.nextInt();
                    for (int i = 0; i < soSanPham; i++) {
                        System.out.println("nhap san pham thu " + (i + 1));
                        SanPhamNhap sp = new SanPhamNhap();
                        sp.nhap();
                        boolean kt = true;
                        for (SanPhamNhap sanPhamNhap : listSanPham) {
                            if(sanPhamNhap.getSp().getMaSanPhan().equals(sp.getSp().getMaSanPhan())) {
                                sanPhamNhap.setSoLuong(sanPhamNhap.getSoLuong() + sp.getSoLuong());
                                kt = false;
                            }
                        }
                        if (kt) {
                            listSanPham.add(sp);
                        }
                    }
                    break;
                case 2:
                    System.out.println("nhap them 1 khach hang");
                    KhachHang khachHang = new KhachHang();
                    khachHang.nhap();
                    break;
                case 4:
                    System.out.println("ds san pham");
                    for (SanPhamNhap sanPhamNhap : listSanPham) {
                        sanPhamNhap.xuat();
                    }
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (chon != 0);
    }
}
