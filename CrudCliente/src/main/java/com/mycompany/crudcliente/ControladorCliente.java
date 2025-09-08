
package com.mycompany.crudcliente;

import java.util.ArrayList;


public class ControladorCliente {
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    public ControladorCliente(){
       Cliente clienteBase = new Cliente(1, "lolo", "47213456");
       clientes.add(clienteBase);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
   
   //crud
   public void AgregarCliente(String Name, String dni){
   
       Cliente nuevoCliente = new Cliente(clientes.size() + 1, Name, dni);
       clientes.add(nuevoCliente);
   }
   
   public void BorrarCliente(String dni){
   
        for (int i = 0; i<clientes.size(); i++) {
            
            Cliente cliente = clientes.get(i);
            
            if(cliente.getDni().equalsIgnoreCase(dni)){
                clientes.remove(i);
                return;
            }
        }
     
   }
   
   public void ActualizarCliente(String dni, String nuevoDni, String nombre){
   
        for (int i = 0; i<clientes.size(); i++) {
            
            Cliente cliente = clientes.get(i);
            
            if(cliente.getDni().equalsIgnoreCase(dni)){
                cliente.setDni(nuevoDni);
                cliente.setNombre(nombre);
                return;
            }
        }
   }
   
   
   
}
