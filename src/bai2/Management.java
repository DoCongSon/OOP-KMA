/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author sonan
 */
public class Management {
    public ArrayList<Person> list;

    public Management(int n) {
        this.list = new ArrayList<Person>(n);
    }

    public Management() {
        this.list = new ArrayList<Person>();
    }
    
    
    public void add(Person a) {
        list.add(a);
    }
    public void delete(String hoTen) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHoTen().equals(hoTen)) {
                list.remove(i);
            }
        }
    }
    
    public void sort() {
         Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return (a.getHoTen().compareTo(b.getHoTen()));
            }
        });
    }
    
    public void display() {
        System.out.format("%12s%12s\n", "TEN", "DIA CHI");
        for (Person person : list) {
            System.out.format("%12s%12s\n", person.getHoTen(), person.getDiaChi());
        }
    }
}
