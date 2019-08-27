/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruaki
 */
public class Counter {

    private int counter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;

    }

    public Counter(int startingValue) {
        this(startingValue,false);

    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return counter;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            return;
        } else {
            counter += increaseAmount;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount < 0) {
            return;
        } else {
            counter -= decreaseAmount;
        }
        if (check && counter <= 0) {
            counter = 0;
        }
    }
}
