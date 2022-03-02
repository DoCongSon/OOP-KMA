
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class ThiSinhKhoiC extends ThiSinh{
    private float van, su, dia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(String hoTen, String ngaySinh, String diaChi, float van, float su, float dia) {
        super(hoTen, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    @Override
    public float getTongDiem() {
        return this.van + this.su + this.dia;
    }

    @Override
    public void hienThi() {
        super.hienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Diem van: " + this.van);
        System.out.println("Diem su: " + this.su);
        System.out.println("Diem dia: " + this.dia);
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem van: ");
        this.van = sc.nextFloat();
        System.out.println("Nhap diem su: ");
        this.su = sc.nextFloat();
        System.out.println("Nhap diem dia: ");
        this.dia = sc.nextFloat();
    }
}
