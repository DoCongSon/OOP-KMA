/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class GiangVien extends NhanVien {

    private String maGiangVien, diaChi, gioiTinh, khoa;

    @Override
    public void hienThi() {
        super.hienThi(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ma giang vien: " + this.maGiangVien);
        System.out.println("Dia Chi: " + this.diaChi);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Khoa: " + this.khoa);

    }

    public GiangVien() {
    }

    public GiangVien(String id, String hoTen, String maGiangVien, String diaChi, String gioiTinh, String khoa) {
        super(id, hoTen);
        this.maGiangVien = maGiangVien;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return super.toString() + "$" + maGiangVien + "$" + diaChi + "$" + gioiTinh + "$" + khoa; //To change body of generated methods, choose Tools | Templates.
    }

}
