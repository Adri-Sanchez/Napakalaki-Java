/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;

import java.util.Random;

/**
 *
 * @author adrisanchez
 */
public class Dice {
    private static final Dice instance = new Dice();
    
    private Dice(){
    
    }
    
    public static Dice getInstance(){
        return instance;
    }
    
    public int nextNumber(){
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }
}
