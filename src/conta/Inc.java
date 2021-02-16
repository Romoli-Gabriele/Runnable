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
public class Inc implements Runnable{

    Contatore c;
 

    public Inc(Contatore c) {
        this.c = c;
    }
    
    
    @Override
    public void run() {
        while(1 == 1){
        if(c.getC()<100){
            c.inc();
            System.out.println(c.getC());
        }
       
        }
    }
    
    
}
