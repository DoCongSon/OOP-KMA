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
public class Person {
    private String hoTen, diaChi;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        this.hoTen = sc.nextLine();
        System.out.println("nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public Person() {
    }

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "hoTen: " + hoTen + ", diaChi: " + diaChi;
    }
    
}
