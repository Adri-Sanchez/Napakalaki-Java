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
public class Player {
    static final int MAXLEVEL = 10;
    private String name;
    private int level;
    private boolean dead = true;
    private boolean canISteal = true;
    private Player enemy;
    private ArrayList<Treasure> hiddenTreasures;
    private ArrayList<Treasure> visibleTreasures;
    private BadConsequence pendingBadConsequence;
    
    // Métodos privados.

    private void bringToLife(){
        dead = false;
    }
    
    private int getCombatLevel(){
        int combatLevel = level;
        
        for (Treasure htreasure : hiddenTreasures){
            combatLevel += htreasure.getBonus();
        }
        
        for (Treasure vtreasure : visibleTreasures){
            combatLevel += vtreasure.getBonus();
        }
        
        return combatLevel;
    }
    
    private void incrementLevels( int i ){
        if( i > 0 ){
            level += i;
        }
    }
    
    private void decrementLevels( int i ){
        if( i > 0 ){
            level -= i;
        }
        
        if( level < 0 ){
            level = 0;
        }
    }
    
    private void setPendingBadConsequence( BadConsequence b ){
        pendingBadConsequence = b;
    }
    
    /*private void applyPrize( Monster m ){
        Prize prize = m.getPrize();
        
        incrementLevels( prize.getLevels() );
        IMPLEMENTAR
    }
    
    private void applyBadConsequence( Monster m ){
        BadConsequence defeat = m.getBadConsequence();
        
        decrementLevels(defeat.getLevels());
        if( defeat.getDeath() ){
            dead = true;
        }
        
        for( int i = 0; i < defeat.getnHiddenTreasures(); i++ ){
            
        }
        
        for( int i = 0; i < defeat.getnVisibleTreasures(); i++ ){
            IMPLEMENTAR
        }
        
    }
    
    private boolean canMakeTreasureVisible( Treasure t ){
        // IMP
    }*/
    
    private int howManyVisibleTreasures( TreasureKind tKind ){
        int count = 0;
        
        for (Treasure vtreasure : visibleTreasures){
            if( vtreasure.getType() == tKind )
                count++;
        }
        
        return count;
    }
    
    private void dieIfNoTreasures(){
        if( hiddenTreasures.isEmpty() && visibleTreasures.isEmpty() ){
            dead = true;
        }
    }
    /*private Treasure giveMeATreasure(){
        // IMP
    }*/
    
    private boolean canYouGiveMeATreasure(){
        return !hiddenTreasures.isEmpty();
    }
    
    private void haveStolen(){
        canISteal = false;
    }

    // Métodos públicos.
    
    Player( String name ){
        this.name = name;
        level = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isDead(){
        return dead;
    }
    
    /* ArrayList<Treasure> getHiddenTreasures(){
        // IMPLEMENTAR
    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        // IMPLEMENTAR
    }
    
    public CombatResult combat( Monster m ){
        // IMPLEMENTAR
    }
    
    public void makeTreasureVisible( Treasure  t ){
        // IMPLEMENTAR
    }
    
    public void discardVisibleTreasure( Treasure t ){
        // IMPLEMENTAR
    }
    
    public void discardHiddenTreasure( Treasure t ){
        // IMPLEMENTAR
    }*/
    
    public boolean validState(){
        return pendingBadConsequence.isEmpty() && ( hiddenTreasures.size() <= 4 );
    }
    
    /*public void initTreasures(){
        // IMPLEMENTAR
    }*/
    
    public int getLevels(){
        return level;
    }
    
    /*public Treasure stealTreasure(){
        // IMPLEMENTAR
    }*/
    
    public void setEnemy( Player enemy ){
        this.enemy = enemy;
    }
    
    public boolean canISteal(){
        return canISteal;
    }
    
    /*public void discardAllTreasures(){
        // IMPLEMENTAR
    }*/
}
