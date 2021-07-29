
package calculadora;


public class testCalculadora {
    
    
    public static void main(String[] args) {
        
            operadores op = new operadores();
            
           op.setOperadorUno(10.5);
           op.setOperadorDos(5.2);
           op.setOperacion("+");
           op.performOperation();
           System.out.println(op.getResultado());
    }
    
}
