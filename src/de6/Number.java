/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de6;

import java.util.Scanner;

/**
 *
 * @author sonan
 */
public class Number {

    private int a, b;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a, b: ");
        this.a = sc.nextInt();
        this.b = sc.nextInt();
    }

    public int cong() {
        return this.a + this.b;
    }

    public int tru() {
        return this.a - this.b;
    }

    public int nhan() {
        return this.a * this.b;
    }

    public int chia() {
        return this.a / this.b;
    }

    public int UCLN() {
        int num1 = this.a;
        int num2 = this.b;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public Number() {
    }

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
