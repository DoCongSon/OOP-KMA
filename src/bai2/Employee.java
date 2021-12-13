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
public class Employee extends Person{
    public float HSL;

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap HSL: ");
        this.HSL = sc.nextFloat();
    }

    public Employee() {
    }

    public Employee(float HSL, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.HSL = HSL;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }
    
    public float getLuong() {
        return this.HSL*1000000;
    }
    

    @Override
    public String toString() {
        return "hoTen: " + super.getHoTen() + ", diaChi: " + super.getDiaChi() + ", luong: " + this.getLuong();
        
    }
    
}
