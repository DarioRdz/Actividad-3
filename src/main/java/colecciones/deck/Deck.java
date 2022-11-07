/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package colecciones.deck;
import java.util.*;
/**
 *
 * @author DARIO
 */
public class Deck {

    public static void main(String[] args) {
        Card card= new Card();
        
        int PALOS = card.PALO.length; 
        int COLORES= card.COLOR.length;
        int VALORES= card.VALOR.length; 
        
        int N= PALOS * COLORES * VALORES; 
        
        ArrayList<String> deck= new ArrayList<String>();
        for (int i= 0; i< VALORES; i++){
         for (int j= 0; j< PALOS; j++){
             deck.add(card.PALO[j]+ ", Rojo," + card.VALOR[i]);
             deck.add(card.PALO[j]+ ", Negro," + card.VALOR[i]);
         }   
        }
        
        Iterator<String> nombreIterator= deck.iterator();
          while(nombreIterator.hasNext()){
          String elemento= nombreIterator.next();
          System.out.println(elemento+ " / ");
         }
          
        suflle(deck); 
        head(deck);
        pick(deck);
        hand(deck);
    }
     
    public static void suflle(ArrayList deck){
       ArrayList<String> values= deck; 
       Collections.shuffle(values);
       System.out.println("\n Se mezcló el Deck");
       Iterator<String> nombreIterator2= deck.iterator(); 
          while(nombreIterator2.hasNext()){
              String elemento= nombreIterator2.next();
              System.out.println(elemento+ " / ");
          } 
    } 
   
    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan: " + deck.size() + "cartas \n");
    }
    
    public static void pick(ArrayList deck){
        Random aleatorio= new Random(); 
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan: " + deck.size() + "cartas \n");
    }
    
    public static void hand(ArrayList deck){
        for(int i=0; i<=4; i++){ 
            System.out.println(deck.get(i)); 
        }
        for(int i=0; i<=4; i++){
           deck.remove(i);         
        }
        System.out.println("Quedan: " + deck.size() + " cartas");
    } 
}
