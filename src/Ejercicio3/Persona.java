package Ejercicio3;

public class Persona {
private String nombre;
private String direccion;
private String identificacion;


    public Persona(String nombre, String direccion, String identificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacion = identificacion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
