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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        int taskNum = 1;
                
        for (String i : this.list) {
            System.out.println(taskNum + ": " + i);
            taskNum++;
        }
    }
    
    public void remove(int number) {
        int removeNum = number - 1; // to account for index=0
        this.list.remove(removeNum);
    }
}
