
package clases;

public class Uso {
    private Auto cliente;
    private Espacio lugar;
    private int entrada;
    private int salida;
    private float tarifaHora;
    
    //constructor
    public Uso (Auto cliente, Espacio lugar, int entrada, int salida, float tarifaHora)
    {
        this.cliente=cliente;
        this.lugar=lugar;
        this.entrada=entrada;//formato sin pm ni am y solo el numero de la hora y minutos con , 00
        this.salida=salida;
        this.tarifaHora=tarifaHora;
    }
    
    //getters y setters
        // Getters
    public Auto getCliente() {
        return cliente;
    }

    public Espacio getLugar() {
        return lugar;
    }

    public int getEntrada() {
        return entrada;
    }

    public int getSalida() {
        return salida;
    }

    public float getTarifaHora() {
        return tarifaHora;
    }

    // Setters
    public void setCliente(Auto cliente) {
        this.cliente = cliente;
    }

    public void setLugar(Espacio lugar) {
        this.lugar = lugar;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public void setTarifaHora(float tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    
    //metodos
    public float CalcularTotal(int entrada, int salida, float tarifaHora)
    {
        int tiempoTotal = entrada - salida;
        float tarifaTotal = tiempoTotal * tarifaHora;
        return tarifaTotal;
    }
}
