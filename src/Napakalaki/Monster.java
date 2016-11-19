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
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badConsequence;
    
    Monster( String name, int level, BadConsequence bc, Prize prize )
    {
        this.name = name;
        combatLevel = level;
        badConsequence = bc;
        this.prize = prize;
    }
    
    @Override
    public String toString(){
       return "\n\nMonster: \nName = "  + name + 
              "\nCombat level = " + Integer.toString(combatLevel) + 
              prize.toString() + badConsequence.toString();
    }
    
    
    public String getName(){
        return name;
    }
    
    public int getCombatLevel(){
        return combatLevel;
    }
    
    public Prize getPrize(){
        return prize;
    }
    
    public BadConsequence getBadConsequence(){
        return badConsequence;
    }
    
    public int getLevelsGained(){
        return prize.getLevels();
    }
    
    public int getTreasuresGained(){
        return prize.getTreasures();
    }
}
