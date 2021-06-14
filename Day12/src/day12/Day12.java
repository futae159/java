/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

import java.util.Scanner;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate() {
        char grade;
        int total = 0;
        for(int i = 0; i < testScores.length;i++) {
           total += testScores[i];
        }
        total = total / testScores.length;
        if (total >= 90 && total <= 100) {
            grade = 'O';
        } else if (total >= 80 && total < 90) {
            grade = 'E';
        } else if (total >= 70 && total < 80) {
            grade = 'A';
        } else if (total >= 55 && total < 70) {
            grade = 'P';
        } else if (total >= 40 && total < 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        return grade;
    }
   
}

public class Day12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
