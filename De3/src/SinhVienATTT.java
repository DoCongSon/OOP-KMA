/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class SinhVienATTT extends Sinhvien{
    private float HocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB, float HocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.HocPhi = HocPhi;
    }

    public float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(float HocPhi) {
        this.HocPhi = HocPhi;
    }

    @Override
    public void HienThi() {
        super.HienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hoc phi: " + this.HocPhi);
    }

    @Override
    public String toString() {
        return super.toString() + ", HocPhi:" + HocPhi;
    }
}
