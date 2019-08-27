
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruaki
 */
public class Phonebook {
    private ArrayList<Person> phoneBook;

    public Phonebook() {
        phoneBook = new ArrayList<Person>();
    }
    
    
    
    public void add(String name, String number){
        this.phoneBook.add(new Person(name,number));
    }
    
    public void printAll(){
        for(Person person : this.phoneBook){
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name){
        for(Person person : this.phoneBook){
            if(person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
