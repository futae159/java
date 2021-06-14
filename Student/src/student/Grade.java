/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author FRANCIS
 */
class Grade extends Student {

    public int score;

    public Grade(String fn, String ln, int p, int s) {
        super(fn, ln, p);
        score = s;
    }

    public char calculate() {
        System.out.println(score);
        if (score < 40) {
            return 'D';
        } else if (score >= 40 && score < 60) {
            return 'B';
        } else if (score >= 60 && score < 75) {
            return 'A';
        } else if (score >= 75 && score < 90) {
            return 'E';
        } else if (score >= 90 && score <= 100) {
            return 'O';
        } else {
            return 'z';
        }
    }
}
