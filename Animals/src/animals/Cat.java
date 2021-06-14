/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author FRANCIS
 */
public class Cat extends Animal {
    
    public Cat() {
        super(7);
        System.out.println("A cat has been created");
    }
    
    public void meow() {
        System.out.println("A cat meows!");
    }
    
    public void prance() {
        System.out.println("A cat prance!");
    }
}
