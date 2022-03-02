/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonan
 */
public class NhanVien {

    private String id, hoTen;

    public void hienThi() {
        System.out.println("ID: " + this.id);
        System.out.println("Ho ten: " + this.hoTen);
    }

    public NhanVien() {
    }

    public NhanVien(String id, String hoTen) {
        this.id = id;
        this.hoTen = hoTen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return id + "$" + hoTen;
    }

}
