
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
public class ThiSinhKhoiA extends ThiSinh {

    private float toan, ly, hoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(String hoTen, String ngaySinh, String diaChi, float toan, float ly, float hoa) {
        super(hoTen, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    @Override
    public float getTongDiem() {
        return this.toan + this.ly + this.hoa;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    @Override
    public void hienThi() {
        super.hienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Diem toan: " + this.toan);
        System.out.println("Diem ly: " + this.ly);
        System.out.println("Diem hoa: " + this.hoa);
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem toan: ");
        this.toan = sc.nextFloat();
        System.out.println("Nhap diem ly: ");
        this.ly = sc.nextFloat();
        System.out.println("Nhap diem hoa: ");
        this.hoa = sc.nextFloat();
    }

}
