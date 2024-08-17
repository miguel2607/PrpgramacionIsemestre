package Ejercicio1;

public class CreditoHipotecario extends Credito {

private Propiedad propiedad;

    public CreditoHipotecario(String estado, SolicitudCredito solicitudCredit,Propiedad propiedad) {
        super(estado, solicitudCredit);

    }


    public Propiedad obtenerPropiedad() {
        return propiedad;
    }
}
