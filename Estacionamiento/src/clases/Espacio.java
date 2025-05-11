package clases;

public class Espacio {

    private int numero;
    private String tipo;
    private boolean ocupado;

    //constructor
    public Espacio(int numero, String tipo, boolean ocupado) {
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

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    //metodos 
    @Override
    public String toString() {
        String salida = "Espacio{";
        salida += "numero: " + this.numero + ", ";
        salida += "tipo: " + this.tipo + ", ";
        salida += "ocupado: " + this.ocupado + "}";
        return salida;
    }

    // equals para comparar objetos ya que == no funciona
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Espacio otroEspacio = (Espacio) o;
        if (this.numero != otroEspacio.numero) {
            return false;
        }
        if (!this.tipo.equals(otroEspacio.tipo)) {
            return false;
        }
        return this.ocupado == otroEspacio.ocupado;
    }

}
