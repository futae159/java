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
public class Animal {
    public int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }
    
    public void eat() {
        System.out.println("An animal is eating"); 
    }
    
    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        c.meow();
        d.eat();
        c.eat();
        d.run();
        c.prance();
    }
    
}
