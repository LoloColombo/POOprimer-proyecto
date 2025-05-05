
package javaapplication1;


 
public class ProductoConVencimiento extends Producto{
   protected int fechaVencimiento; 
   
   public ProductoConVencimiento(String nombre, float precio, long codigoBarra, String marca, int fechaVen)
   {
      super(nombre, precio, codigoBarra, marca);
      this.fechaVencimiento=fechaVen;
      
   }
   

   
   public int getFechaVencimiento()
      {
          return fechaVencimiento;
      }
   
   public void setFechaVencimiento(int fechaVencimiento)
   {
       this.fechaVencimiento=fechaVencimiento;
   
   }
   
   @Override
   public void MostrarProductos()
   {
   super.MostrarProductos();
   System.out.println("Fecha Vencimiento: " + this.fechaVencimiento);
   }
   
   @Override
   public String toString()
   {
     return super.toString() + ", fecha vencimiento = " + this.fechaVencimiento;
   }
   
}
