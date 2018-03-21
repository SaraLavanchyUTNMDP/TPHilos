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
public class BeerProducer extends Thread {
    private String ProducedBeer;
    private BeerHouse house;

    public BeerProducer(String ProducedBeer, BeerHouse house) {
        this.ProducedBeer = ProducedBeer;
        this.house=house;
    }
    
    @Override
    public void run(){
        while(this.house.getstock()!=0){
            this.house.ChargingTheHouse();
            System.out.println("Producing: ");
            try{
                sleep(3);
            }catch(InterruptedException e){}
        }
    }
    
    public void nameBeer(String name){
        this.ProducedBeer=name;
    }
 
    public String getProducedBeer() {
        return ProducedBeer;
    }

    
}
