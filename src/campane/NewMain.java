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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable din = new Campana("din",9);
        Runnable don = new Campana("don",9);
        Runnable dan = new Campana("dan",9);
        
        Thread tdin = new Thread(din);
        Thread tdon = new Thread(don);
        Thread tdan = new Thread(dan);
        
        tdin.start();
        tdon.start();
        tdon.start();
    }
    
}
