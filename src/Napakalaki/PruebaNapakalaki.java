 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;

import static Napakalaki.PruebaNapakalaki.monstruos;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author adrisanchez
 */

public class PruebaNapakalaki {

    static ArrayList<Monster> monstruos = new ArrayList();
    
    //Devuelve un array de monstruos que contiene aquellos cuyo nivel de combate es superior a 10.
    static ArrayList<Monster> monsters_levelTen(){
        ArrayList<Monster> validos = new ArrayList();
        
        for (Monster monstruo : monstruos){
            if( monstruo.getCombatLevel() > 10 )
                validos.add(monstruo);
        }
        
        return validos;
    }
    
    //Devuelve un array de monstruos cuyo mal rollo implique solo pérdida de niveles
    static ArrayList<Monster> monsters_LoseLevels(){
        ArrayList<Monster> validos = new ArrayList();
        BadConsequence auxiliary_bc;
        
        for (Monster monstruo : monstruos){
            auxiliary_bc = monstruo.getBadConsequence();
            
            if( auxiliary_bc.getLevels() > 0 &&
                auxiliary_bc.getnHiddenTreasures() == 0 && 
                auxiliary_bc.getnVisibleTreasures() == 0 &&
                auxiliary_bc.getDeath() == false )
            {
                validos.add(monstruo);
            }
            
        }
        
        return validos;
    }
    
    //Devuelve un array de monstruos cuyo buen rollo implique ganancia de más de un nivel
    static ArrayList<Monster> monsters_GainLevels(){
        ArrayList<Monster> validos = new ArrayList();
        Prize auxiliary_prize;
        
        for (Monster monstruo : monstruos){
            auxiliary_prize = monstruo.getPrize();
            
            if( auxiliary_prize.getLevels() > 1 ){
                validos.add(monstruo);
            }
        }
        
        return validos;
    }
    
    //Devuelve un array de monstruos cuyo mal rollo suponga la perdida de un determinado tipo de tesoro.
    static ArrayList<Monster> monsters_LoseItems( TreasureKind item_type ){
        ArrayList<Monster> validos = new ArrayList();
        
        BadConsequence auxiliary_bc;
        boolean found;
        
        for (Monster monstruo : monstruos){
            auxiliary_bc = monstruo.getBadConsequence();
            found = false;
            
            for( int i = 0; i < auxiliary_bc.getSpecificHiddenTreasures().size() && !found; i++ ){
                if( auxiliary_bc.getSpecificHiddenTreasures().get(i) == item_type ){
                    validos.add(monstruo);
                    found = true;
                }
            }
            
            for( int i = 0; i < auxiliary_bc.getSpecificVisibleTreasures().size() && !found; i++ ){
                if( auxiliary_bc.getSpecificVisibleTreasures().get(i) == item_type ){
                    validos.add(monstruo);
                    found = true;
                }
            }
            
        }
        
        return validos;
    }
    
    //Crea lista de monstruos por defecto del juego.
    static void CrearMonstruos(){
           
            //Bicefalo
            BadConsequence badConsequence = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos.", 3, Integer.MAX_VALUE, 0);
            Prize prize = new Prize(2,1);
            monstruos.add(new Monster("Bicefalo", 21, badConsequence, prize));
     
            // Tongue
            badConsequence = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles.", 2, 5, 0);
            prize = new Prize(2,1);
            monstruos.add(new Monster("Tongue", 19, badConsequence, prize));
     
            // El espia sordo
            badConsequence = new BadConsequence("Te asusta en la noche. Pierdes un casco visible.", 0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
            prize = new Prize(1,1);
            monstruos.add(new Monster("El espia sordo", 5, badConsequence, prize));
     
     
            //Roboggoth
            badConsequence = new BadConsequence("La quinta directiva primaria te obliga a perder 2 niveles y un tesoro 2 manos visible.", 2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
            prize = new Prize(2,1);
            monstruos.add(new Monster("Roboggoth", 8, badConsequence, prize));
     
            //Familia feliz
            badConsequence = new BadConsequence("La familia te atrapa. Estás muerto.", true);
            prize = new Prize(2,1);
            monstruos.add(new Monster("Familia feliz", 1, badConsequence, prize));
     
            //Angeles de la noche ibicenca
     
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",0,
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
            prize = new Prize(4,1);
            monstruos.add(new Monster("Ángeles de la noche ibicenca", 14, badConsequence,
            prize));
     
            //Semillas Cthulhu
            badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos.",2,0,2);
            prize = new Prize(2,1);
            monstruos.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize));
     
            //Dameargo
            badConsequence = new BadConsequence("Te intentas escaquear. Pierdes una mano visible.",0,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
            prize = new Prize(2,1);
            monstruos.add(new Monster("Dameargo", 1, badConsequence, prize));
     
            //Pollipólipo volante
            badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles.",3,0,0);
            prize = new Prize(2,1);
            monstruos.add(new Monster("Pollipólipo volante", 3, badConsequence, prize));
     
            //Yskhtihyssg-Goth
            badConsequence = new BadConsequence("No le hace gracia que\n" +
            "pronuncien mal su nombre. Estas\n" +
            "muerto",true);
            prize = new Prize(3,1);
            monstruos.add(new Monster("Yskhtihyssg-Goth", 14, badConsequence, prize));
       
            //  h.p. Munchcraft
            badConsequence = new BadConsequence("Pierdes la armadura visisble", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList() );
            prize = new Prize (2,1);
            monstruos.add(new Monster ("H.P. Munchcraft",6, badConsequence, prize));
     
            //Necrógrafo
            badConsequence= new BadConsequence ("Sientes bichos bajo la ropa. Descártate la armadura visible",0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList() );
            prize = new Prize (1,1);
            monstruos.add(new Monster("Necrógrafo",13,badConsequence,prize));
     
            //Rey Rosado
            badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
            prize = new Prize(4,2);
            monstruos.add(new Monster("El rey de rosa", 13, badConsequence, prize));
     
            //Felcher
            badConsequence = new BadConsequence ("Toses los pulmones y pierdes dos niveles", 2,0,0);
            prize= new Prize(1,1);
            monstruos.add(new Monster("Felcher", 2, badConsequence, prize));
     
            //los Hondos
            badConsequence = new BadConsequence("Estos monstruos resultan bastante superficiales y te aburren mortalmente.Estas muerto.",true);
            prize = new Prize(2,1);
            monstruos.add(new Monster(" Los Hondos", 8, badConsequence, prize));
       
            // 3 Byakhees de bonanza
            badConsequence = new BadConsequence("Pierdes tu armadura visible y otra oculta",0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)) , new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
            prize = new Prize(2,1);
            monstruos.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
               
            // Tenochtitlan
            badConsequence = new BadConsequence("Embobados con el lindo primigenio te descartas de tu casco visible",0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList()  );
            prize = new Prize(1,1);
            monstruos.add(new Monster("Tenochtitlan", 2, badConsequence, prize));
     
               
            // El sopor de Dunwich
            badConsequence = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible", 0, new ArrayList(Arrays.asList(TreasureKind.SHOES)), new ArrayList() );
            prize = new Prize(1,1);
            monstruos.add(new Monster("El sopor de Dunwich", 2, badConsequence, prize));
     
               
            // Demonios de Magaluf
            badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), new ArrayList(Arrays.asList(TreasureKind.ONEHAND)) );
            prize = new Prize(4,1);
            monstruos.add(new Monster("Demonios de Magaluf", 2, badConsequence, prize));
     
               
            // El gorrón en el umbral
            badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",0, Integer.MAX_VALUE, 0);
            prize = new Prize(3,1);
            monstruos.add(new Monster("El gorrón en el umbral", 13, badConsequence, prize));
               
        }
    
    public static void main(String[] args) {
       CrearMonstruos();
       
       ArrayList<Monster> TEST = monsters_LoseItems(TreasureKind.HELMET);
       
       System.out.println(TEST);
       
       
       
    }
    
     
    
       
       
    
}
