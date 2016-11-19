/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;

/**
 *
 * @author adrisanchez
 */
public class Prize {
    private int levels;
    private int treasures;
    
    Prize( int treasures, int levels)
    {
        this.levels = levels;
        this.treasures = treasures;
    }
    
    @Override
    public String toString(){
        return "\nPrize: " + 
               "\nLevels = " + Integer.toString(levels) +
               "\nTreasures = " + Integer.toString(treasures);
    }
    
    int getTreasures(){
        return treasures;
    }
    
    int getLevels(){
        return levels;
    }
    
    void setTreasures( int treasures ){
        this.treasures = treasures;
    }
    
    void setLevels( int levels ){
        this.levels = levels;
    }
}
