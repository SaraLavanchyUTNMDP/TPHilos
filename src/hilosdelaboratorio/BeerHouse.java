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
public class BeerHouse {
    private int stock;
    
    public BeerHouse(int stock) {
        this.stock = stock;
    }

    public int getstock() {
        synchronized(this){
            return stock;
        }
    }

    public void setstock(int stock) {
        synchronized(this){
            this.stock = stock;
        }
    }
    
    public void ChargingTheHouse() {
        synchronized(this){
            System.out.println(this.stock);
            while(this.stock>99)
             {
                try{
                    wait();
                } catch (InterruptedException e){ }
            }
            this.stock++;
            notifyAll();        
            System.out.println("Despues de Producir. En la casa hay un total de: "+this.stock);

        }
    }
    
    public void dischargingTheHouse(){
        synchronized(this){
            System.out.println(this.stock);
            while(this.stock<1)
            {
                try{
                    System.out.println("waiting");
                    wait();
                } catch (InterruptedException e){ }
            }
            this.stock--;
            notifyAll();        
            System.out.println("Despues de consumir. En la casa hay un total de: "+this.stock);
        }
    }
}
