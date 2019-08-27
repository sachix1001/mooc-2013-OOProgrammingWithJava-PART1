/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruaki
 */
public class Player {

    private String name;
    private int goal;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goal;
    }

    public String toString() {
        return name + ", goals " + goal;
    }

}
