/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJava;

/**
 *
 * @author luisr
 */
public class testJavaBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int[] arreglo ={1,3,5,4,2,5,7};
    int[] negativo ={-1,-2,3,5,-6};
    double[] arreglo2 ={1,3,5,7,9,13};
    int arr[] = {-3,-5,-7};
       BasicJava test = new BasicJava(); 
       
       test.MostrarBucle();
       test.ImprimirImpar();
       test.ImprimirSuma();
       test.RecorrerArreglo(arreglo);
       test.ValorMaximo(arr);
       test.VGA(arreglo2);
       test.ArregloNegativo();
       test.mayorQueY(arreglo, 3);
       test.Cuadrados(arreglo);
       test.remplazoNegativos(negativo);
       test.MaxMinProm(arreglo);
       test.ajuste(arreglo);
      
        
    }
    
}
