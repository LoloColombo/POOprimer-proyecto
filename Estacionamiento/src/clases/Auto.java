
package clases;


public class Auto {
    private String patente;
    private String modelo;
    private String marca;
    private String color;
    
//constructor
public Auto (String patente, String modelo, String marca, String color)
{
    this.patente = patente;
    this.modelo = modelo;
    this.marca = marca;
    this.color =color;
}

//getters y setters

public String getPatente(){
    return patente;
}
public void setPatente(String patente){
    this.patente = patente;
}

public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}

public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}

}



