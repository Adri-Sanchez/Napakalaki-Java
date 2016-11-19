/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author adrisanchez
 */
public class CardDealer {
    private static final CardDealer instance = new CardDealer();
    
    private ArrayList<Monster>  unusedMonsters;
    private ArrayList<Monster>  usedMonsters;
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;

    // Singleton
    
    private CardDealer(){
    
    }
    
    public static CardDealer getInstance(){
        return instance;
    }
    
    // Métodos privados
    
    private void initTreasureCardDeck(){
        // ¡Sí mi amo!
        unusedTreasures.add(new Treasure("¡Sí mi amo!", 4, TreasureKind.HELMET));
        
        //Botas de investigación
        unusedTreasures.add(new Treasure("Botas de investigación", 3, TreasureKind.SHOES));
        
        // Capucha de Cthulhu
        unusedTreasures.add(new Treasure("Capucha de Cthulhu", 3, TreasureKind.HELMET));
        
        // A prueba de babas
        unusedTreasures.add(new Treasure("A prueba de babas", 2, TreasureKind.ARMOR));
        
        // Botas de lluvia ácida
        unusedTreasures.add(new Treasure("Botas de lluvia ácida", 1, TreasureKind.BOTHHANDS));
        
        // Casco minero
        unusedTreasures.add(new Treasure("Casco minero", 2, TreasureKind.HELMET));
        
        // Ametralladora ACME
        unusedTreasures.add(new Treasure("Ametralladora ACME", 4, TreasureKind.BOTHHANDS));
        
        // Camiseta de la ETSIIT
        unusedTreasures.add(new Treasure("Camiseta de la ETSIIT", 1, TreasureKind.ARMOR));
        
        // Clavo de rail ferroviario
        unusedTreasures.add(new Treasure("Clavo de rail ferroviario", 3, TreasureKind.ONEHAND));
        
        // Cuchillo de sushi arcano
        unusedTreasures.add(new Treasure("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND));
        
        // Fez alópodo
        unusedTreasures.add(new Treasure("Fez alópodo", 3, TreasureKind.HELMET));
        
        // Hacha prehistórica
        unusedTreasures.add(new Treasure("Hacha prehistórica", 2, TreasureKind.ONEHAND));
        
        // El aparato del Pr. Tesla
        unusedTreasures.add(new Treasure("El aparato del Pr. Tesla", 4, TreasureKind.ARMOR));
        
        // Gaita
        unusedTreasures.add(new Treasure("Gaita", 4, TreasureKind.BOTHHANDS));
        
        // Insecticida
        unusedTreasures.add(new Treasure("Insecticida", 2, TreasureKind.ONEHAND));
        
        // Escopeta de 3 cañones
        unusedTreasures.add(new Treasure("Escopeta de 3 cañones", 4, TreasureKind.BOTHHANDS));
        
        // Garabato místico
        unusedTreasures.add(new Treasure("Garabato místico", 2, TreasureKind.ONEHAND));
        
        // La rebeca metálica
        unusedTreasures.add(new Treasure("La rebeca metálica", 2, TreasureKind.ARMOR));
        
        // Lanzallamas
        unusedTreasures.add(new Treasure("Lanzallamas", 4, TreasureKind.BOTHHANDS));
        
        // Necro-comicón
        unusedTreasures.add(new Treasure("Necro-comicón", 1, TreasureKind.ONEHAND));
        
        // Necronomicón
        unusedTreasures.add(new Treasure("Necronomicón", 5, TreasureKind.BOTHHANDS));
        
        // Linterna a 2 manos
        unusedTreasures.add(new Treasure("Linterna a 2 manos", 3, TreasureKind.BOTHHANDS));
        
        // Necro-gnomicón
        unusedTreasures.add(new Treasure("Necro-gnomicón", 2, TreasureKind.ONEHAND));
        
        // Necrotelecom
        unusedTreasures.add(new Treasure("Necrotelecom", 2, TreasureKind.HELMET));
        
        // Mazo de los antiguos
        unusedTreasures.add(new Treasure("Mazo de los antiguos", 3, TreasureKind.ONEHAND));
        
        // Necro-playboycón
        unusedTreasures.add(new Treasure("Necro-playboycón", 3, TreasureKind.ONEHAND));
        
        // Porra preternatural
        unusedTreasures.add(new Treasure("Porra preternatural", 2, TreasureKind.ONEHAND));
        
        // Shogulador
        unusedTreasures.add(new Treasure("Shogulador", 1, TreasureKind.BOTHHANDS));
        
        // Tentáculo de pega
        unusedTreasures.add(new Treasure("Tentáculo de pega", 2, TreasureKind.HELMET));
        
        // Varita de atizamiento
        unusedTreasures.add(new Treasure("Varita de atizamiento", 3, TreasureKind.ONEHAND));
        
        // Zapato deja-amigos
        unusedTreasures.add(new Treasure("Zapato deja-amigos", 1, TreasureKind.SHOES));





    }
    
    private void initMonsterCardDeck(){
        
            //Bicefalo
            BadConsequence badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos.", 3, Integer.MAX_VALUE, 0);
            Prize prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Bicefalo", 21, badConsequence, prize));
     
            // Tongue
            badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles.", 2, 5, 0);
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Tongue", 19, badConsequence, prize));
     
            // El espia sordo
            badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible.", 0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
            prize = new Prize(1,1);
            unusedMonsters.add(new Monster("El espia sordo", 5, badConsequence, prize));
     
     
            //Roboggoth
            badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible.", 2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Roboggoth", 8, badConsequence, prize));
     
            //Familia feliz
            badConsequence = new BadConsequence("La familia te atrapa. Estás muerto.", true);
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Familia feliz", 1, badConsequence, prize));
     
            //Angeles de la noche ibicenca
     
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
            prize = new Prize(4,1);
            unusedMonsters.add(new Monster("Ángeles de la noche ibicenca", 14, badConsequence,
            prize));
     
            //Semillas Cthulhu
            badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos.",2,0,2);
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize));
     
            //Dameargo
            badConsequence = new BadConsequence("Te intentas escaquear. Pierdes una mano visible.",0,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Dameargo", 1, badConsequence, prize));
     
            //Pollipólipo volante
            badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles.",3,0,0);
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("Pollipólipo volante", 3, badConsequence, prize));
     
            //Yskhtihyssg-Goth
            badConsequence = new BadConsequence("No le hace gracia que\n" +
            "pronuncien mal su nombre. Estas\n" +
            "muerto",true);
            prize = new Prize(3,1);
            unusedMonsters.add(new Monster("Yskhtihyssg-Goth", 14, badConsequence, prize));
       
            //  h.p. Munchcraft
            badConsequence = new BadConsequence("Pierdes la armadura visisble", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList() );
            prize = new Prize (2,1);
            unusedMonsters.add(new Monster ("H.P. Munchcraft",6, badConsequence, prize));
     
            //Necrógrafo
            badConsequence= new BadConsequence ("Sientes bichos bajo la ropa. Descártate la armadura visible",0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList() );
            prize = new Prize (1,1);
            unusedMonsters.add(new Monster("Necrógrafo",13,badConsequence,prize));
     
            //Rey Rosado
            badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
            prize = new Prize(4,2);
            unusedMonsters.add(new Monster("El rey de rosa", 13, badConsequence, prize));
     
            //Felcher
            badConsequence = new BadConsequence ("Toses los pulmones y pierdes dos niveles", 2,0,0);
            prize= new Prize(1,1);
            unusedMonsters.add(new Monster("Felcher", 2, badConsequence, prize));
     
            //los Hondos
            badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente.Estas muerto.",true);
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster(" Los Hondos", 8, badConsequence, prize));
       
            // 3 Byakhees de bonanza
            badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta",0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)) , new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
            prize = new Prize(2,1);
            unusedMonsters.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
               
            // Tenochtitlan
            badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible",0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList()  );
            prize = new Prize(1,1);
            unusedMonsters.add(new Monster("Tenochtitlan", 2, badConsequence, prize));
     
               
            // El sopor de Dunwich
            badConsequence = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible", 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)), new ArrayList() );
            prize = new Prize(1,1);
            unusedMonsters.add(new Monster("El sopor de Dunwich", 2, badConsequence, prize));
     
               
            // Demonios de Magaluf
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList(Arrays.asList(TreasureKind.ONEHAND)) );
            prize = new Prize(4,1);
            unusedMonsters.add(new Monster("Demonios de Magaluf", 2, badConsequence, prize));
     
               
            // El gorrón en el umbral
            badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",0, Integer.MAX_VALUE, 0);
            prize = new Prize(3,1);
            unusedMonsters.add(new Monster("El gorrón en el umbral", 13, badConsequence, prize));
        
    }
    
    private void shuffleTreasures(){
        Collections.shuffle(unusedTreasures);
    }
    
    private void shuffleMonsters(){
        Collections.shuffle(unusedMonsters);
    }
  
    // Métodos públicos
    
    /*public Treasure nextTreasure(){
    
    }
    
    public Monster nextMonster(){
    
    }*/
    
    public void giveTreasureBack( Treasure t ){
        usedTreasures.add(t);
    }
    
    public void giveMonsterBack( Monster m ){
        usedMonsters.add(m);
    }
    
    /*public void initCards(){
    
    }*/
}
