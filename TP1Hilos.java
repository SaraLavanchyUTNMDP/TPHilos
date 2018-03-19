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
       BeerHouse house = new BeerHouse(0);
       BeerProducer Producer1 = new BeerProducer("Blonde", 50, house);
       BeerProducer Producer2 = new BeerProducer("IPA", 60, house);
       BeerConsumer Consumer1 = new BeerConsumer(house,20);
       Producer1.start();
       Consumer1.start();
       Producer2.start();
    
    }
    
}
