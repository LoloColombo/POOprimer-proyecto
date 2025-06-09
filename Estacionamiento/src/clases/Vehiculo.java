
package clases;
import interfaces.estacionamiento;

public abstract class Vehiculo implements estacionamiento{
    
    protected String patente;
    protected String modelo;
    protected String marca;
    protected String color;  
    
    public Vehiculo(String patente, String modelo, String marca, String color){
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metodos 
    @Override
    public String toString() {
        String salida = "Vehiculo{";
        salida += "patente: " + this.patente + ", ";
        salida += "modelo: " + this.modelo + ", ";
        salida += "marca: " + this.marca + ", ";
        salida += "color: " + this.color + ", ";
        return salida;
    }

    //equals para comparar objetos ya que == no funciona 
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Auto otroAuto = (Auto) o; //casteo
        if (otroAuto.patente.equals(this.patente) != true) {
            return false;
        }
        if (otroAuto.modelo.equals(this.modelo) != true) {
            return false;
        }
        if (otroAuto.marca.equals(this.marca) != true) {
            return false;
        }
        //mismo objeto
        return otroAuto.color.equals(this.color) == true;
    }
    
    @Override
    public void estacionar(){
        System.out.println("El auto con la patente" + patente + "ha estacionado");
    }
    
    @Override
    public void salirEstacionamiento(){
        System.out.println("El auto con la patente" + patente + "ha salido del estacionamiento");
    }
}
