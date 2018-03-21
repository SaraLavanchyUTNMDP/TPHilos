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
public class BeerConsumer extends Thread {
    private BeerHouse currentHouse;
    
    public BeerConsumer( BeerHouse house, int cant) {
        this.currentHouse=house;
    }
    
    public  void consumingBeer(){
        this.currentHouse.dischargingTheHouse();
        try{
            sleep(2);
        }catch(InterruptedException e){};
        
    }
    
    @Override
    public void run(){
        while(currentHouse.getstock()!=0)
            this.consumingBeer();
    }

}
    
    

