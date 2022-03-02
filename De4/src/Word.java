/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Objects;

/**
 *
 * @author sonan
 */
public class Word {
    private int ID;
    private String en, vn; 

    public void hienThi() {
        System.out.println("ID: " + this.ID);
        System.out.println("English: " + this.en);
        System.out.println("Viet Nam: " + this.vn);
    }

    public Word() {
    }

    public Word(int ID, String en, String vn) {
        this.ID = ID;
        this.en = en;
        this.vn = vn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
}
