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
public class DiaChi {
    public String to, phuong, quan, thanhPho;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap to: ");
        this.to = sc.nextLine();
        System.out.println("nhap phuong");
        this.phuong = sc.nextLine();
        System.out.println("nhap quan");
        this.quan = sc.nextLine();
        System.out.println("nhap thanh pho");
        this.thanhPho = sc.nextLine();
    }

    public DiaChi() {
    }

    public DiaChi(String to, String phuong, String quan, String thanhPho) {
        this.to = to;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
    
}
