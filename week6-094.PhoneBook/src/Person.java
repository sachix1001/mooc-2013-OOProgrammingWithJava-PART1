/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruaki
 */
public class Person {
    private String name;
    private String number;

    public Person(String name, String phone) {
        this.name = name;
        this.number = phone;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String phone) {
        this.number = phone;
    }

    @Override
    public String toString() {
        return name + "  number: "+ number;
    }
    
    
    
    
}
