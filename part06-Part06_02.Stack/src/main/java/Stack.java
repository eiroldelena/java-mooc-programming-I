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
public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(0, value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        String taken = this.list.get(0);
        this.list.remove(0);
        return taken;
    }
}
