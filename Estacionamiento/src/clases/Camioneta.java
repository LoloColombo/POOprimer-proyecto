package clases;

public class Camioneta extends Auto {

    protected boolean cajaAbierta;

    public Camioneta(String patente, String modelo, String marca, String color, boolean cajaAbierta) {
        super(patente, modelo, marca, color);
        this.cajaAbierta = cajaAbierta;
    }

    //getters y setters
    public boolean getCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }

    //metodos 
    @Override
    public String toString() {
        String salida = super.toString();
        salida += ", cajaAbierta: " + this.cajaAbierta + "}";
        return salida;
    }

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
        Camioneta otraCamioneta = (Camioneta) o;
        return this.cajaAbierta == otraCamioneta.cajaAbierta;
    }

}
