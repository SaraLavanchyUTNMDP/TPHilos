/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdelaboratorio;

/**
 *
 * @author Lavanchy
 */
public class Main {
    
    public static void main(String[] args) {
       BeerHouse house = new BeerHouse(100);
       BeerProducer Producer1 = new BeerProducer("Blonde", house);
       Producer1.start();
       while(house.getstock()!=0){
        BeerConsumer Consumer1 = new BeerConsumer(house,20);
        Consumer1.start();
       }
     
    
    }
    
}
