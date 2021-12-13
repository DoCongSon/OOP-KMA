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
public class Student extends Person{
    private float diem1, diem2;
    
    public float getDiemTrungBinh() {
        return (this.diem1 + this.diem2)/2;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem 1: ");
        this.diem1 = sc.nextFloat();
        System.out.println("nhap diem 2: ");
        this.diem2 = sc.nextFloat();
    }

    public Student() {
    }

    public Student(float diem1, float diem2, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    @Override
    public String toString() {
        return "hoTen: " + super.getHoTen() + ", diaChi: " + super.getDiaChi() + ", diemTrungBinh: " + this.getDiemTrungBinh();
    }
    
    
    
}
