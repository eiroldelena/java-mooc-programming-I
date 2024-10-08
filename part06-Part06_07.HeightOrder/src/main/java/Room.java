/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class Room {
    private ArrayList<Person> list; 
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        
        Person shortest = this.list.get(0);
        
        for (Person person : this.list) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
    
        return shortest;
    }
    
    public Person take() {
        if (isEmpty()) {
            return null;
        }
        
        Person taken = shortest();
        
        this.list.remove(this.shortest());
        
        return taken;
    }
}
