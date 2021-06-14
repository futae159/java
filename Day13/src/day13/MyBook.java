/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day13;

/**
 *
 * @author FRANCIS
 */
class MyBook extends Book {

    int price;

    MyBook(String tn, String an, int pn) {
        super(tn, an);
        this.price = pn;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
