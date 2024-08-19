package Ejercicio1;




public class Cliente extends Persona{

private String ingresos;
private String historialCrediticio ;




    public Cliente(String nombre, String identificacion, String direccion,String Ingresos,String historialcrediticio) {
        super(nombre, identificacion, direccion);
        this.ingresos = Ingresos;
        this.historialCrediticio = historialcrediticio;
    }


    public String getIngresos() {
        return ingresos;
    }

    public String getHistorialCrediticio() {
        return historialCrediticio;
    }
}
