/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruaki
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        this.value++;
        if (this.upperLimit < this.value) {
            this.value = 0;
        }
    }

    public String toString() {
        if(value < 10){
        return "0" + value;
        }else{
            return"" + value;
        }
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        if(0 < value && value <= this.upperLimit){
            this.value = value;
            
        }
    }
// write code here
}
