/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campane;

/**
 *
 * @author informatica
 */
public class Campana implements Runnable{
    String suono;
    int volte;

    public Campana(String suono, int volte) {
        this.suono = suono;
        this.volte = volte;
    }

    @Override
    public void run() {
        for(int i = 0; i<volte; i++){
        
        System.out.println(/*(volte+1)*/+suono+" dun");
        }
    }
    
    
}
