
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
public abstract class ThiSinh {

    private String hoTen, ngaySinh, diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public abstract float getTongDiem();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Dia chi: " + this.diaChi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
