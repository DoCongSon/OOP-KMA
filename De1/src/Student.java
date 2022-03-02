/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class Student extends Person {

    private String maSV, email;
    private float diem;

    public Student() {
    }

    public Student(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maSV, String email, float diem) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return super.toString() + "$" + maSV + "$" + email + "$" + diem;
    }

    @Override
    public void hienThi() {
        super.hienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ma sinh vien: " + this.maSV);
        System.out.println("email: " + this.email);
        System.out.println("diem tong ket: " + this.diem);
    }

}
