/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author luisr
 */
public class puzzleJava {
    
    public void uno (){
        ArrayList<Integer> num  = new ArrayList<>();
        int arr[]={3,5,1,2,7,9,8,13,25,32};
        int contador=0;
        for(int i=0;i<arr.length;i++){
            contador = contador+ arr[i];
            if (arr[i]>10){
            num.add(arr[i]);
            }
        }
        System.out.println("la suma del arreglo es: "+contador);
        System.out.println("los numeros mayores a 10 son: "+num);
    }
    
    public void dos (){
    
        ArrayList<String> nombre= new ArrayList<>();
        ArrayList<String> lista = new ArrayList<>();
        Collections.addAll(nombre,"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa");
        Collections.shuffle(nombre);
        for(int i=0; i<nombre.size();i++){
            if(nombre.get(i).length()>5){
                lista.add(nombre.get(i));
            }
        }
        System.out.println(nombre);
        System.out.println(lista);
        }
        
    public void tres(){
        
    ArrayList<Character> abc = new ArrayList<>();
    Collections.addAll(abc,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z');
    Collections.shuffle(abc);
    System.out.println("La ultima letra del arreglo es: "+abc.get(26));
    if(abc.get(0)=='a'||abc.get(0)=='e'||abc.get(0)=='i'||abc.get(0)=='o'||abc.get(0)=='u'){
    System.out.println("la primera letra es una vocal y es: "+abc.get(0));  
    }
    System.out.println(abc);
    
    }
    
    public void cuatro(){
        
//    Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
//    Para obtener un número entero aleatorio, puede utilizar el método nextInt 
//    de la clase Random. Documentación de la Clase Random.
   
        ArrayList<Integer> numeros = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<10;i++){
            numeros.add(r.nextInt(100-55+1)+55);
        }
        System.out.println(numeros);
    
    }
    
    public void cinco(){
    
//    Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y 
//    hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo). 
//    Imprimir todos los números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.
        
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<10;i++){
            numeros.add(r.nextInt(100-55+1)+55);
        }
        Collections.sort(numeros);
        System.out.println(numeros);
        System.out.println("el primer valor es: "+numeros.get(0));
        System.out.println("el ultimo valor es: "+numeros.get(numeros.size()-1));
    
    }
    
    public void seis(){
    
//Crear una cadena aleatoria con 5 caracteres de longitud.
     String letras = new String ("abcdefghijklmnñopqrstuvwxyz");
     String cadena="";
     Random r = new Random();
        for(int i=0; i<5;i++){
            int posicion = r.nextInt(letras.length()-1);
            cadena= cadena + letras.charAt(posicion);
                              
     }
     System.out.println(cadena);
        
        
    }
    
    public void siete(){
    
//Crear una cadena aleatoria con 5 caracteres de longitud.
     String letras = new String ("abcdefghijklmnñopqrstuvwxyz");
//   String cadena="";
     ArrayList<String> arr = new ArrayList<>();
     Random r = new Random();
     for(int x =0;x<10;x++){ 
         String cadena=""; 
            for(int i=0; i<5;i++){
               int posicion = r.nextInt(letras.length()-1);
               cadena= cadena + letras.charAt(posicion);
            }     
        arr.add(cadena);                               
     }
     System.out.println(arr);
        
        
    }
    
    
}
