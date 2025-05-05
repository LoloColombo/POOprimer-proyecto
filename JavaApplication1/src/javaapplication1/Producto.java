package javaapplication1;

public class Producto {

    //atributos y valores por defecto
    protected String nombre;
    protected float precio;
    protected long codigoBarra;
    protected String marca;

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
    
    
    
   public void MostrarProductos()
   {
    System.out.println("Datos del producto");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Codigo de Barras: " + this.codigoBarra);
        System.out.println("Marca: " + this.marca);
   }
    
   @Override
   public String toString()
   {
   String salida="Producto{";
   salida+= "nombre: " + this.nombre + ", ";
   salida+= "precio: " + this.precio + ", ";
   salida+= "Codigo De Barras: " + this.codigoBarra + ", ";
   salida+= "Marca: " + this.marca + ", ";
   
   return salida;
   }
   
   //equals para comparar objetos ya que == no funciona 
   @Override
   public boolean equals(Object o)
   {
     if (this == o){ return true;}
     if (o == null){ return false;}
     if (this.getClass() != o.getClass()){return false;}
     Producto otroProducto = (Producto) o; //casteo
     if (otroProducto.precio != this.precio){return false;}
     if (otroProducto.codigoBarra != this.codigoBarra){return false;}
     if (otroProducto.nombre.equals(this.nombre) !=true){return false;}//porque es string 
     if(otroProducto.marca.equals(this.marca) !=true) {return false;}
       return true;//mismo objeto
   }
   
   
}
