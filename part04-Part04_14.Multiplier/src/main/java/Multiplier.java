/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Multiplier {
    private int product;
    
    public Multiplier(int number) {
        this.product = number;
    }
    
    public int multiply(int number) {
        this.product = this.product * number;
        return this.product;
    }
}
