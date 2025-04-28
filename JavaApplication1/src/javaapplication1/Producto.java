package javaapplication1;

public class Producto {

    //atributos y valores por defecto
    private String nombre;
    private float precio;
    private long codigoBarra;
    private String marca;

    //constructor con valores por defecto
    public Producto()
    {
      this.nombre = "";
      this.precio = 0.0f;
      this.codigoBarra = 001l;
      this.marca = "";
    }
    
    //constructor completo
    public Producto(String nombre, float precio, long codigoBarra, String marca)
    {
     this.nombre=nombre;
     this.precio=precio;
     this.codigoBarra=codigoBarra;
     this.marca=marca;
    }
    
    //gets y sets
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String newName) {
        this.nombre = newName;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float newPrecio) {
        this.precio = newPrecio;
    }

    public long getcodigoBarra() {
        return this.codigoBarra;
    }

    public void setcodigoBarra(long newCodigoBarra) {
        this.codigoBarra = newCodigoBarra;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String newMarca) {
        this.nombre = newMarca;
    }
}
