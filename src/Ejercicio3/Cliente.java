package Ejercicio3;

public class Cliente extends Persona{

    private String historialCompras;

    public Cliente(String nombre, String direccion, String identificacion) {
        super(nombre, direccion, identificacion);
    }


    public String getHistorialCompras() {
        return historialCompras;
    }
}
