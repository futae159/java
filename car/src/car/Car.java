/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;
    
/**
 *
 * @author FRANCIS
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfTheCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    
    
    
    public void printVariables() {
        System.out.println("This is the maxSpeed: " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfTheCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10); 
    }
    
    public void getIn() {
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
        } else {
            System.out.println("The car is full!");
        }
         
    }
    
    public void getOut() {
        if(this.numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in the car!");
        }
    }
    
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn() {
        if(!isTheCarOn) {
            isTheCarOn = true;      
        } else {
            System.out.println("The car is already on!s");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        
        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();
        
        System.out.println("Birthday Car v3");
        birthdayPresent.getOut();
        birthdayPresent.printVariables();
//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
         
    
    }
    
}
