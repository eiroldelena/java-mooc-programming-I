/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Team {
    private String name;
    private int points;
    private int wins;
    private int losses;
    
    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public String toString() {
        return this.name + ", " + this.points;
    }
}
