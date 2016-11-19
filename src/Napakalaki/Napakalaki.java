/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;

import java.util.ArrayList;

/**
 *
 * @author adri_
 */
public class Napakalaki {
    private Monster currentMonster;
    private Player currentPlayer;
    private ArrayList<Player> players = new ArrayList();
    private CardDealer dealer;

    // Singleton
    private static final Napakalaki instance = new Napakalaki();
    
    private Napakalaki(){
    
    }
    
    public static Napakalaki getInstance(){
        return instance;
    }
    
    // Métodos privados
    
    /*private void initPlayers( ArrayList<String> names ){
    
    }
    
    private Player nextPlayer(){
    
    }
    
    private boolean nextTurnAllowed(){
    
    }
    
    private void setEnemies(){
    
    }*/
    
    // Métodos públicos
    
   /* public CombatResult developCombat(){
    
    }
    
    public void discardVisibleTreasures( ArrayList<Treasure> treasures ){
        
    }
    
    public void discardHiddenTreasures( ArrayList<Treasure> treasures ){
    
    }
    
    public void makeTreasuresVisible( ArrayList<Treasure> treasures ){
    
    }
    
    public void initGame( ArrayList<String> players ){
    
    }*/
    
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    
    public Monster getCurrentMonster(){
        return currentMonster;
    }
    
   /* public boolean nextTurn(){
    
    }
    
    public boolean endOfGame( CombatResult result ){
    
    }*/
}
