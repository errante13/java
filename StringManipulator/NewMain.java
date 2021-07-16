/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulator;


public class NewMain {

    public static void main(String[] args) {
    
        //metodo trin and concat 
        System.out.println("METODO TRIM AND CONCAT");
        System.out.println();
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo  
        System.out.println();
        
        //METODO GET INDEX OF NULL
        System.out.println("METODO GET INDEX OF NULL CON STRING Y CHAR");
        System.out.println();
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1
        System.out.println();
        
        
        //METODO GET INDEX OF NULL CON STRINGS
        System.out.println("METODO DE GET INDEX OF NULL CON DOS STRING");
        System.out.println();
        String wordUno = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int D = manipulator.getIndexOrNull(wordUno, subString);
        int E = manipulator.getIndexOrNull(wordUno, notSubString);
        System.out.println(D); // 2
        System.out.println(E); // -1
        System.out.println();
        
       //METODO CONCAT SUBSTRING
       System.out.println("METODO CONTAC SUBSTRING");
       System.out.println();
       String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
       System.out.println(word); // olmundo 
        
        
    }
    
}
