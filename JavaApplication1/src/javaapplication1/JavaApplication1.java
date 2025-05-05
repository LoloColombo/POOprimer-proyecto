package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto");
        String nombre = scn.nextLine();
        

        System.out.println("Ingrese el precio del producto");
        float precio = scn.nextFloat();
        

        System.out.println("Ingrese el codigo del producto");
        long codigoBarra = scn.nextLong();
        

        scn.nextLine();

        System.out.println("Ingrese la marca del producto");
        String marca = scn.nextLine();
       

        System.out.println("Ingrese la fechavencimiento del producto");
        int fechaVen = scn.nextInt();
        
        
        
        ProductoConVencimiento p1 = new ProductoConVencimiento(nombre, precio, codigoBarra, marca, fechaVen);
        
       p1.MostrarProductos();

    }

}
