/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author informatica
 */
public class IncDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Contatore c = new Contatore();
        Runnable inc1 = new Inc(c);
        Runnable dec1 = new Dec(c);
        
        Thread tr1 = new Thread(inc1);
        Thread tr2 = new Thread(dec1);
        
        tr1.start();
        tr2.start();
    }
    
}
