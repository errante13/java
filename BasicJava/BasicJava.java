/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author luisr
 */
public class BasicJava {
    
   
    public void MostrarBucle(){
        for(int x=1;x<=255;x++){
            System.out.println(x); 
        }
    }
   
    public void ImprimirImpar(){
        for(int x=1;x<=255;x++){
            if(x%2==0){
                System.out.println(x);
            } 
        }
    }
    
    public void ImprimirSuma(){
        int contador=0; 
        for(int x=0;x<=255;x++){
            contador=contador+x;
            System.out.println("Nuevo Numero: "+x+" suma es: "+contador);
       }
    }
    
    public void RecorrerArreglo(int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
               System.out.println(arreglo[i]);
        }   
    }    
    
    public void ValorMaximo(int[] arreglo){
        int max=arreglo[0]; 
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]>max){
                max = arreglo[i];
            }              
        }
        System.out.println("el valor maximo del arreglo es: "+max);
    }
   
    public void VGA (double arreglo[]) {
        double suma =0;
        for(int i=0;i<arreglo.length; i++){
        suma = suma+arreglo[i];
        }
    System.out.println(suma/arreglo.length);
    }  
     
    public void ArregloNegativo(){
        ArrayList<Integer> y = new ArrayList<>();
        for (int i=1; i <= 255; i++){
           if(i%2!=0){
               y.add(i);
           } 
        }        
        System.out.println(y);
    }
    
    public void mayorQueY(int arreglo[], int y){
        int contador=0;
        for(int i =0; i<arreglo.length; i++){
            if(arreglo[i]>y){
            contador++;}
        }
        System.out.println("los valores mayores que "+y+" son: "+contador);
    }
    
    public void Cuadrados(int arreglo[]){
        for(int i=0; i<arreglo.length;i++){
            arreglo[i]=arreglo[i]*arreglo[i];
        }
    System.out.print(Arrays.toString(arreglo));        
    }
    
    public void remplazoNegativos(int arreglo[]){
    
        for (int i=0; i<arreglo.length;i++){
            if(arreglo[i]<0){
                arreglo[i]=0;
            }
        }
    System.out.print(Arrays.toString(arreglo));
    }
    
    public void MaxMinProm(int arreglo[]){
        int max =arreglo[0];
        int min =arreglo[0];
        int sum =0; 
            for (int i=0; i<arreglo.length;i++){
                sum =sum + arreglo[i];
                if(max<arreglo[i]){
                max = arreglo[i];
                }
                if(min>arreglo[i]){
                min=arreglo[i];
                }
            }
        System.out.println("el valor mayor es: "+ max);
        System.out.println("el valor menor es: "+ min);
        System.out.println("el promedio es: "+ sum/arreglo.length);
        
    }

    public void ajuste(int arreglo[]){
        for(int i=0; i<arreglo.length-1;i++ ){
           arreglo[i] = arreglo[i+1];    
        }
        arreglo[arreglo.length-1] = 0; 
        System.out.println(Arrays.toString(arreglo));       
    }
    
}
