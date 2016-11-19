/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;
import java.util.ArrayList;

/**
 *
 * @author adrisanchez
 */
public class BadConsequence {
    private static final int MAXTREASURES = 10;
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures  = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    BadConsequence( String text, int levels, int nVisible, int nHidden )
    {
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
    }
    
    BadConsequence( String text, boolean death )
    {
        this.text = text;
        this.death = death;
    }
    
    BadConsequence( String text, int levels, 
            ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden)
    {
        this.text = text;
        this.levels = levels;
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
    }
    
    @Override
    public String toString(){
        String isDead;
        if(this.death){ isDead = "Yes"; }
        else{ isDead = "No"; }
        
        return "\nBadConsequence: " +
               "\nText = " + text +
               "\nLevels = " + Integer.toString(levels) +
               "\nNVisible Treasures = " + Integer.toString(nVisibleTreasures) +
               "\nNHidden Treasures = " + Integer.toString(nHiddenTreasures) +
               "\nDeath = " + isDead;
                
    }
    
    String getText()
    {
        return text;
    }
    
    int getLevels()
    {
        return levels;
    }
    
    int getnVisibleTreasures()
    {
        return nVisibleTreasures;
    }
    
    int getnHiddenTreasures()
    {
        return nHiddenTreasures;
    }
    
    boolean getDeath()
    {
        return death;
    }
    
    ArrayList<TreasureKind> getSpecificHiddenTreasures()
    {
        return specificHiddenTreasures;
    }
    
    ArrayList<TreasureKind> getSpecificVisibleTreasures()
    {
        return specificVisibleTreasures;
    }
    
    boolean isEmpty(){
        return (nHiddenTreasures == 0 && nVisibleTreasures == 0 ) ||
               (specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty());
    }
    
   /* void substractVisibleTreasure( Treasure t ){
        // IMPLEMENTACION
    }
    
    void substractHiddenTreasure( Treasure t ){
        // IMPLEMENTACION
    }
    
    BadConsequence adjustToFitTreasureLists( ArrayList<Treasure> v,
            ArrayList<Treasure> h){
    
        // IMPLEMENTACION
    }*/
    
    
}
