
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
public class BirdList {
    private ArrayList<Bird> birdList;

    public BirdList() {
        birdList = new ArrayList<Bird>();
    }
    
    public void addBird(Bird bird){
        birdList.add(bird);
    }
    
    public void Obsevation(String bird){
        if(!isBirdOnList(bird)){
            System.out.println("Is not a bird!");
            
        }else{
            for(Bird name : birdList){
                if(name.getName().contains(bird)){
                    name.observed();
                }
            }
        }
    }
    
    public boolean isBirdOnList(String bird){
        boolean onList = false;
        for(Bird name : birdList){
            if(name.getName().contains(bird)){
                onList = true;
            }
        }
        return onList;
    }
    
    public void statistics(){
        for(Bird name : birdList){
            System.out.println(name);
        }
    }
    
    public void show(String bird){
        for(Bird name : birdList){
            if(name.getName().equals(bird))
                System.out.println(name);
        }
    }
}
