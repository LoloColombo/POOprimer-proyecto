
package clases;


public class Espacio {
    private int numero;
    private String tipo;
    private boolean ocupado;
    
    //constructor
    public Espacio(int numero, String tipo, boolean ocupado)
    {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = ocupado;
    }
    
    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
