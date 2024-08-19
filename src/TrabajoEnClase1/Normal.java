package TrabajoEnClase1;

public class Normal {

    private String nombre1 ;
    private String nombre2;
    private String nombre3;


    public Normal(String nombre1, String calles, String mascota) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
    }


    @Override
    public String toString() {
        return "Normal{" +
                "nombre1='" + nombre1 + '\'' +
                ", nombre2='" + nombre2 + '\'' +
                ", nombre3='" + nombre3 + '\'' +
                '}';
    }
}
