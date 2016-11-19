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
    
    private void setTreasures( int treasures ){
        this.treasures = treasures;
    }
    
    private void setLevels( int levels ){
        this.levels = levels;
    }
    
    Prize( int treasures, int levels)
    {
        setTreasures(treasures);
        setLevels(levels);
    }
    
    @Override
    public String toString(){
        return "\nPrize: " + 
               "\nLevels = " + Integer.toString(levels) +
               "\nTreasures = " + Integer.toString(treasures);
    }
    
    public int getTreasures(){
        return treasures;
    }
    
    public int getLevels(){
        return levels;
    }
    
    
    
    
}
