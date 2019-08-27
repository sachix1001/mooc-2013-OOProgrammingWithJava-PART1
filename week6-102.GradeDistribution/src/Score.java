
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author teruaki
 */
public class Score {

    private int[] scores;
    private double allScores;
    private int accepted;

    public Score() {
        scores = new int[6];

    }

    public void addScores(int score) {
        if (score < 0 || 60 < score) {
            return;
        }
        int grade = scoreToGrade(score);
        scores[grade]++;
    }

    public int scoreToGrade(int score) {

        if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;
        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        } else {
            return 5;
        }

    }

    public void printScores() {
        System.out.println("Grade distribution:");
        int grade = 0;
        for (int i : scores) {
            System.out.print(grade + ": ");
            printStars(i);
            grade++;
        }

    }

    public void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printPercentage() {
        int allScores = 0;
        System.out.print("Acceptancepercentage: ");
        
        for(int i : scores){
            allScores += i;
        }
        double accepted = allScores - scores[0];
        System.out.println(100 * accepted / allScores);
    }
}


