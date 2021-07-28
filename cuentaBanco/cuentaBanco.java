
package cuentaBanco;

import java.util.Random;


public class cuentaBanco {
    
    private String numero; 
    private double saldoCuentaCorriente;
    private double saldoCuentaAhorro;
    private static int numeroCuentas;
    private static double totalMonto;

//constructor 
    public cuentaBanco() {
       this.numero = this.generador();
       numeroCuentas++; 
       
    }
    
    
    
// get and set
    public String getNumero() {
        return numero;
    }

//    public void setNumero(String numero) {
//        this.numero = numero;
//    }

    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

//    public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
//        this.saldoCuentaCorriente = saldoCuentaCorriente;
//    }

    public double getSaldoCuentaAhorro() {
        return saldoCuentaAhorro;
    }

//    public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
//        this.saldoCuentaAhorro = saldoCuentaAhorro;
//    }
    
    private String generador (){
        String numero="";
        Random r = new Random();
            for(int i=0;i<10;i++){
                numero=numero+r.nextInt(9);
            }
        return numero; 
    }
    
    public void view(){
        System.out.println("----------- VISTA ----------");
        System.out.print("Numero Cuenta: ");
        System.out.println(this.numero);
        System.out.println("saldos");
        System.out.print("cuenta de ahorro: ");
        System.out.println(this.saldoCuentaAhorro);
        System.out.print("cuenta corriente: ");
        System.out.println(this.saldoCuentaCorriente);
//        System.out.println("variables estaticas");
//        System.out.println(numeroCuentas);
//        System.out.println(totalMonto);
//        
    }
    
    public void depositar(double cantidad, int cuenta){
        System.out.println("----------- DEPOSITO ----------");
       if(cuenta == 1){
           System.out.println("el numero de cuenta es: "+this.numero);
           System.out.println("cuenta corriente:");
           this.saldoCuentaCorriente = this.saldoCuentaCorriente+cantidad; 
           System.out.println("su saldo nuevo es: "+getSaldoCuentaCorriente());
           totalMonto = totalMonto+ cantidad;
       }else if(cuenta ==2){
            System.out.println("el numero de cuenta es: "+this.numero);
            System.out.println("cuenta ahorro:");
            this.saldoCuentaAhorro = this.saldoCuentaAhorro+cantidad;
            System.out.println("su saldo nuevo es: "+getSaldoCuentaAhorro());
            totalMonto = totalMonto+ cantidad;
    }else{
           System.out.println("el numero de cuenta es: "+this.numero);
           System.out.println("el tipo de cuenta no es válido");
       }   
    
    }
    
    public void retirar(double cantidad, int cuenta){
        System.out.println("----------- RETIRO ----------");
        if (cuenta ==1){
            if(cantidad <= getSaldoCuentaCorriente()){
                this.saldoCuentaCorriente=this.saldoCuentaCorriente-cantidad;
                System.out.println("cuenta corriente:");
                System.out.println("su nuevo saldo es: "+getSaldoCuentaCorriente());
            
            }else{
                System.out.println("fondos insuficientes");
                System.out.println("cuenta corriente:");
                System.out.println("su saldo es: "+getSaldoCuentaCorriente());
            }
            
        }else if(cuenta ==2){
            if(cantidad <= getSaldoCuentaAhorro()){
                this.saldoCuentaAhorro=this.saldoCuentaAhorro-cantidad;
                System.out.println("cuenta de ahorro: ");
                System.out.println("su nuevo saldo es: "+getSaldoCuentaAhorro());
            
            }else{
                System.out.println("fondos insuficientes");
                System.out.println("cuenta de ahorro: ");
                System.out.println("su saldo es: "+getSaldoCuentaAhorro());
                
            }
        }else{
             System.out.println("cuenta inexistente");
        }
    }
    
    
    
}
