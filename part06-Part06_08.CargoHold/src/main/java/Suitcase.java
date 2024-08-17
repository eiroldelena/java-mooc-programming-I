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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);            
        }    
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        if (items.isEmpty()) {
            return 0;
        }
        
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item i : items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        
        return heaviest;
    }
    
    public void printItems() {        
        for (Item i : this.items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.totalWeight() + "kg)";
        }
        
        return this.items.size() + " items " + "(" + this.totalWeight() + "kg)";
    }
}
