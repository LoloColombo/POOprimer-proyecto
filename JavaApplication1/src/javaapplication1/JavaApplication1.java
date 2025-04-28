package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Producto p1 = new Producto();

        System.out.println("Ingrese el nombre del producto");
        String nombre = scn.nextLine();
        p1.setNombre(nombre);

        System.out.println("Ingrese el precio del producto");
        float precio = scn.nextFloat();
        p1.setPrecio(precio);

        System.out.println("Ingrese el codigo del producto");
        long codigoBarra = scn.nextLong();
        p1.setcodigoBarra(codigoBarra);

        scn.nextLine();

        System.out.println("Ingrese la marca del producto");
        String marca = scn.nextLine();
        p1.setMarca(marca);

        System.out.println("Datos del producto");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: " + p1.getPrecio());
        System.out.println("Codigo de Barras: " + p1.getcodigoBarra());
        System.out.println("Marca: " + p1.getMarca());

    }

}
