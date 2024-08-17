package Ejercicio1;

public class Propiedad {

    private String direccion;
    private String valor;

    public Propiedad(String valor, String direccion) {
        this.valor = valor;
        this.direccion = direccion;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerValor() {
        return valor;
    }
}
