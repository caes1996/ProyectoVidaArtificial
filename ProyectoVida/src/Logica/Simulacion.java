
package Logica;

import java.util.*;

/**
 *
 * @author Santiago Romero
 */
public class Simulacion {
    int randomX;
    int randomY;
    ArrayList<Oveja> Ovejas = new ArrayList<>();
    Oveja laOveja;
    ArrayList<Lobo> Lobos = new ArrayList<>();
    Lobo elLobo;
    ArrayList<Pasto> Pasto = new ArrayList<>();    
    Pasto elPasto;

    
    
    public ArrayList<Oveja> Oveja(int cantOvejas){
        for(int i=0; i< cantOvejas;i++){     
            randomX= (int) (Math.random()*(1150)) + 10;
            randomY= (int) (Math.random()*(450)) + 10;
            if(i%2 == 0){
                laOveja = new Oveja(i, randomX, randomY);
            }
            else{
                laOveja = new Oveja(i, randomX, randomY);
            }            
            Ovejas.add(laOveja);      
        }        
        return Ovejas;        
    }

    public ArrayList<Lobo> Lobo(int cantLobos) {     
        for(int i=0; i< cantLobos;i++){
            randomX= (int) (Math.random()*(1150)) + 10;
            randomY= (int) (Math.random()*(450)) + 10;
            elLobo = new Lobo(i, randomX, randomY);
            Lobos.add(elLobo);
        }
        return Lobos;
    }
    
    public ArrayList<Pasto> Pasto(){
        int cantPasto = 1;        
        for(int i=0; i< cantPasto;i++){
            randomX= (int) (Math.random()*(1150)) + 10;
            randomY= (int) (Math.random()*(450)) + 10;
            elPasto = new Pasto(i, randomX, randomY);
            Pasto.add(elPasto);            
        }  
        return Pasto;
    }
}
