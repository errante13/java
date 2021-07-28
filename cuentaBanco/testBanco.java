/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaBanco;

/**
 *
 * @author luisr
 */
public class testBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        cuentaBanco cb = new cuentaBanco();
        cuentaBanco cb2 = new cuentaBanco();
        
        cb.depositar(1000, 1);
        cb2.depositar(100, 1);
        cb.depositar(1000, 2);
        cb2.depositar(100, 2);
        cb.retirar(300, 1);
        cb2.retirar(200, 2);
        cb.view();
        cb2.view();
    }

    
}
