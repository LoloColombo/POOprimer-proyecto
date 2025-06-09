package clases;


public class Auto extends Vehiculo{

protected int cantidadPuertas;


//constructor
    public Auto(String patente, String modelo, String marca, String color, int cantidadPuertas) {
        super(patente, modelo, marca, color);
        this.cantidadPuertas = cantidadPuertas;

    }

    public int getCantidadPuertas(){
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertas){
        this.cantidadPuertas = cantidadPuertas;
    }

//metodos 
    @Override
    public String toString() {
        String salida = super.toString();
        salida += ", cantidad Puertas: " + this.cantidadPuertas + "}";
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
        if (!super.equals(o)) {
            return false;
        }
        Auto otroAuto = (Auto) o;
        return this.cantidadPuertas ==  otroAuto.cantidadPuertas;
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
