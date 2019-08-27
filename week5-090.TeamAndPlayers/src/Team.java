
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
public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (this.size() < maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }
    
    public int goals(){
        int goals = 0;
        for(Player player : players){
            goals += player.goals();
        }
        return goals;
    }
}
