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
public class test {
    public static void menu() {
        System.out.println("nhap: ");
        System.out.println("1: Student");
        System.out.println("2: Employee");
        System.out.println("3: Customer");
        System.out.println("0: thoat");
    }
    public static void menuMain() {
        System.out.println("1: nhap");
        System.out.println("2: hien thi");
        System.out.println("3: xap sep");
        System.out.println("0: thoat");
    }

    public static void main(String[] args) {
        Management management = new Management();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            menuMain();
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    int n;
                    do {
                        menu();
                        n = sc.nextInt();
                        switch (n) {
                            case 1:
                                Person a = new Student();
                                a.nhap();
                                management.list.add(a);
                                break;
                            case 2:
                                Person b = new Employee();
                                b.nhap();
                                management.list.add(b);
                                break;
                            case 3:
                                Person c = new Customer();
                                c.nhap();
                                management.list.add(c);
                                break;
                            case 4:
                                break;
                            default:
                                break;
                        }
                    } while (n != 0);
                    break;
                case 2:
                    management.display();
                    break;
                case 3:
                    management.sort();
                case 0:
                    break;
                default:
                    break;
            }
            
        } while (chon != 0);
    }
}
