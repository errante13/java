
package calculadora;


public class operadores {
    
    private double operadorUno;
    private double operadorDos;
    private String operacion; 
    private double resultado; 

    public operadores() {
    }

    public double getOperadorUno() {
        return operadorUno;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setOperadorUno(double operadorUno) {
        this.operadorUno = operadorUno;
    }

    public double getOperadorDos() {
        return operadorDos;
    }

    public void setOperadorDos(double operadorDos) {
        this.operadorDos = operadorDos;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public double performOperation(){
        if(operacion=="+"){
        this.resultado = this.operadorUno+this.operadorDos;
        }else if(operacion == "-"){
        
        this.resultado = this.operadorUno-this.operadorDos;
        }else{
            System.out.println("operador no valido");
        }
        
    return resultado;     
    }
    
}
